package daos

import com.example.generated.tables.pojos.Trainer
import com.example.generated.tables.Trainer as TrainerTable
import config.Database.sql

class TrainersDao {
    private val trainersTable = TrainerTable.TRAINER

    fun getTrainers(): List<Trainer> {
        return sql.select(trainersTable.ID, trainersTable.NAME, trainersTable.ADDRESS, trainersTable.PHONE)
            .from(trainersTable)
            .fetchInto(Trainer::class.java)
    }

    fun getTrainer(trainerId: Long): Trainer? {
        return sql.select(trainersTable.ID, trainersTable.NAME, trainersTable.ADDRESS, trainersTable.PHONE)
            .from(trainersTable)
            .where(trainersTable.ID.eq(trainerId))
            .fetchOne { record ->
                Trainer(
                    record.get(trainersTable.ID),
                    record.get(trainersTable.NAME),
                    record.get(trainersTable.ADDRESS),
                    record.get(trainersTable.PHONE)
                )
            }
    }

    fun addTrainer(trainer: Trainer): Boolean {
        return sql.insertInto(trainersTable)
            .set(trainersTable.NAME, trainer.name)
            .set(trainersTable.ADDRESS, trainer.address)
            .set(trainersTable.PHONE, trainer.phone)
            .execute() > 0
    }

    fun editTrainer(trainer: Trainer): Boolean {
        return sql.update(trainersTable)
            .set(trainersTable.NAME, trainer.name)
            .set(trainersTable.ADDRESS, trainer.address)
            .set(trainersTable.PHONE, trainer.phone)
            .where(trainersTable.ID.eq(trainer.id))
            .execute() > 0
    }

    fun removeTrainer(trainerId: Long): Boolean {
        return sql.deleteFrom(trainersTable)
            .where(trainersTable.ID.eq(trainerId))
            .execute() > 0
    }
}