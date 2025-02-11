package daos

import com.example.generated.tables.Training as TrainingTable
import Training
import config.Database.sql
import java.time.LocalDate

class TrainingDao {
    private val trainingTable = TrainingTable.TRAINING

    fun getTraining(trainingId: Long): Training? {
        return sql.select(trainingTable.TYPE, trainingTable.MAX_TRAINEES, trainingTable.DATE_TIME, trainingTable.DURATION)
            .from(trainingTable)
            .where(trainingTable.ID.eq(trainingId))
            .fetchOne { record ->
                Training(
                    trainingId,
                    maxTrainees = record.get(trainingTable.MAX_TRAINEES).toInt(),
                    type = TrainingType.valueOf(record.get(trainingTable.TYPE)),
                    duration = record.get(trainingTable.DURATION).toInt(),
                    dateTime = record.get(trainingTable.DATE_TIME)
                )
            }
    }

    fun editTraining(training: Training): Boolean {
        return sql.update(trainingTable)
            .set(trainingTable.MAX_TRAINEES, training.maxTrainees.toLong())
            .set(trainingTable.TYPE, training.type.name)
            .set(trainingTable.DATE_TIME, training.dateTime)
            .set(trainingTable.DURATION, training.duration.toLong())
            .where(trainingTable.ID.eq(training.id))
            .execute() > 0
    }

    fun addTraining(training: Training): Boolean {
        return sql.insertInto(trainingTable)
            .set(trainingTable.TYPE, training.type.name)
            .set(trainingTable.MAX_TRAINEES, training.maxTrainees.toLong())
            .set(trainingTable.DURATION, training.duration.toLong())
            .set(trainingTable.DATE_TIME, training.dateTime)
            .execute() > 0
    }

    fun getTrainings(): List<Training> {
        return sql.select(trainingTable.ID, trainingTable.TYPE, trainingTable.MAX_TRAINEES, trainingTable.DATE_TIME, trainingTable.DURATION)
            .from(trainingTable)
            .fetchInto(Training::class.java)
    }

    fun getTrainingsByDate(date: LocalDate): List<Training> {
        return sql.select(trainingTable.ID, trainingTable.TYPE, trainingTable.MAX_TRAINEES, trainingTable.DATE_TIME, trainingTable.DURATION)
            .from(trainingTable)
            .where(trainingTable.DATE_TIME.between(date.atStartOfDay(), date.plusDays(1).atStartOfDay()))
            .fetchInto(Training::class.java)
    }

    fun removeTraining(trainingId: Long): Boolean {
        return sql.deleteFrom(trainingTable)
            .where(trainingTable.ID.eq(trainingId))
            .execute() > 0
    }
}