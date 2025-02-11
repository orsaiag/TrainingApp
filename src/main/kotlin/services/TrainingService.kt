package services

import daos.TrainingDao
import Training
import java.time.LocalDate

class TrainingService(private val dao: TrainingDao) {
    fun getTraining(trainingId: Long): Training? {
        return dao.getTraining(trainingId)
    }

    fun addTraining(training: Training): Boolean {
        return dao.addTraining(training)
    }

    fun editTraining(training: Training): Boolean {
        return dao.editTraining(training)
    }

    fun getTrainings(): List<Training> {
        return dao.getTrainings()
    }

    fun getTrainingsByDate(date: LocalDate): List<Training> {
        return  dao.getTrainingsByDate(date)
    }

    fun removeTraining(trainingId: Long) {
        dao.removeTraining(trainingId)
    }
}