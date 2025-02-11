package services

import daos.TraineePerTrainingDao
import Trainee
import javassist.NotFoundException
import java.time.LocalDateTime
import javax.naming.LimitExceededException

class RegisterService(private val dao: TraineePerTrainingDao, private val trainingService: TrainingService, private val traineeService: TraineeService) {
    fun register(trainingId: Long, traineeId: Long): Boolean {
        traineeService.getTrainee(traineeId) ?: throw NotFoundException("Trainee wasn't found")
        val training = trainingService.getTraining(trainingId) ?: throw NotFoundException("Training wasn't found")
        val traineeInTraining = dao.getRegisteredTrainee(trainingId)
        when {
            LocalDateTime.now().isAfter(training.dateTime)-> throw IllegalArgumentException("Training has already pass")
            traineeInTraining.size >= training.maxTrainees -> throw LimitExceededException("Too many trainees in training")
            traineeInTraining.map { it.id }
                .contains(traineeId) -> throw IllegalArgumentException("Trainee already exist")

            else -> return dao.register(trainingId, traineeId)
        }
    }

    fun cancel(trainingId: Long, traineeId: Long): Boolean {
        traineeService.getTrainee(traineeId) ?: throw NotFoundException("Trainee wasn't found")
        val training = trainingService.getTraining(trainingId) ?: throw NotFoundException("Training wasn't found")
        return when {
            LocalDateTime.now()
                .isAfter(training.dateTime) -> throw IllegalArgumentException("Training has already pass")

//            training.dateTime.minusHours(3).isBefore(LocalDateTime.now()) -> {
//                // notify shenhav and take payment
//                //notify the trainee and make sure if it's ok - cancel - if not don't do anything
//                //toDo
//            }
            //todo- notify trainee in waiting list
            else -> dao.cancel(trainingId, traineeId)
        }
    }

    fun getRegisteredTrainee(trainingId: Long): List<Trainee> {
        return dao.getRegisteredTrainee(trainingId)
    }
}