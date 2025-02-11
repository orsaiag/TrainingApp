package services

import com.example.generated.tables.pojos.Trainer
import daos.TrainersDao

class TrainersService(private val dao: TrainersDao) {

    fun getTrainers(): List<Trainer> {
       return dao.getTrainers()
    }

    fun getTrainer(trainerId: Long): Trainer? {
        return dao.getTrainer(trainerId)
    }

    fun addTrainer(trainer: Trainer): Boolean {
        return dao.addTrainer(trainer)
    }

    fun removeTrainer(trainerId: Long): Boolean {
        return dao.removeTrainer(trainerId)
    }

    fun editTrainer(trainer: Trainer): Boolean{
        return dao.editTrainer(trainer)
    }

}