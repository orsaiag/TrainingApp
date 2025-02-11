package daos

import PaymentMethod
import com.example.generated.tables.MembershipTypeForMonth as MembershipTable
import com.example.generated.tables.TraineePerTraining
import com.example.generated.tables.Trainee as TraineeTable
import Trainee
import com.example.generated.tables.pojos.MembershipTypeForMonth
import config.Database.sql

class TraineePerTrainingDao {
    private val traineePerTrainingTable = TraineePerTraining.TRAINEE_PER_TRAINING
    private val traineeTable = TraineeTable.TRAINEE
    private val membershipTypeTable = MembershipTable.MEMBERSHIP_TYPE_FOR_MONTH


    fun cancel(trainingId: Long, traineeId: Long): Boolean {
       return sql.deleteFrom(traineePerTrainingTable)
           .where(traineePerTrainingTable.TRAINEE_ID.eq(traineeId))
           .and(traineePerTrainingTable.TRAINING_ID.eq(trainingId))
           .execute() > 0
    }

    fun register(trainingId: Long, traineeId: Long): Boolean {
        return sql.insertInto(traineePerTrainingTable)
            .set(traineePerTrainingTable.TRAINING_ID, trainingId)
            .set(traineePerTrainingTable.TRAINEE_ID, traineeId)
            .execute() > 0
    }

    fun getRegisteredTrainee(trainingId: Long): List<Trainee> {
        return sql.select(
            traineePerTrainingTable.TRAINEE_ID,
            traineePerTrainingTable.TRAINING_ID,
            traineeTable.ID,
            traineeTable.NAME,
            traineeTable.PAYMENT_METHOD,
            traineeTable.PHONE,
            traineeTable.NOTE,
            traineeTable.MEMBERSHIP,
            membershipTypeTable.PRICE,
            membershipTypeTable.NAME
        )
            .from(traineePerTrainingTable)
            .join(traineeTable).on(traineePerTrainingTable.TRAINEE_ID.eq(traineeTable.ID))
            .join(membershipTypeTable).on(membershipTypeTable.ID.eq(traineeTable.MEMBERSHIP))
            .where(traineePerTrainingTable.TRAINING_ID.eq(trainingId))
            .fetch { record ->
                Trainee(
                    id = record.get(traineeTable.ID),
                    name = record.get(traineeTable.NAME),
                    phone = record.get(traineeTable.PHONE),
                    paymentMethod = record.get(traineeTable.PAYMENT_METHOD)?.let { PaymentMethod.valueOf(it) } ?: PaymentMethod.BIT,
                    note = record.get(traineeTable.NOTE) ?: null,
                    membership = MembershipTypeForMonth(
                        record.get(membershipTypeTable.NAME),
                        record.get(membershipTypeTable.PRICE),
                        record.get(traineeTable.MEMBERSHIP)
                    )
                )
            }
    }
}