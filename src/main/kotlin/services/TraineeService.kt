package services

import Trainee
import daos.TraineeDao

class TraineeService(private val dao: TraineeDao) {
    fun getTrainee(): List<Trainee> {
        return dao.getTrainees()
    }

    fun getTrainee(traineeId: Long): Trainee? {
        return dao.getTrainee(traineeId)
    }

    fun addTrainee(trainee: Trainee): Boolean {
        return dao.addTrainee(trainee)
    }

    fun removeTrainee(traineeId: Long): Boolean {
        return dao.removeTrainee(traineeId)
    }

    fun editTrainee(trainee: Trainee): Boolean {
        return dao.editTrainee(trainee)
    }
}