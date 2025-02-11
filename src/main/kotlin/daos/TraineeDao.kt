package daos

import PaymentMethod
import com.example.generated.tables.MembershipTypeForMonth as membershipTable
import Trainee
import com.example.generated.tables.pojos.MembershipTypeForMonth
import com.example.generated.tables.Trainee as TraineeTable
import config.Database.sql

class TraineeDao {
    private val traineesTable = TraineeTable.TRAINEE
    private val membershipTypeTable = membershipTable.MEMBERSHIP_TYPE_FOR_MONTH

    fun getTrainees(): List<Trainee> {
        return sql.select(
            traineesTable.ID,
            traineesTable.NAME,
            traineesTable.PAYMENT_METHOD,
            traineesTable.PHONE,
            traineesTable.NOTE,
            traineesTable.MEMBERSHIP,
            membershipTypeTable.ID,
            membershipTypeTable.PRICE,
            membershipTypeTable.NAME
        )
            .from(traineesTable)
            .join(membershipTypeTable)
            .on(traineesTable.MEMBERSHIP.eq(membershipTypeTable.ID))
            .fetch { record ->
                Trainee(
                    name = record.get(traineesTable.NAME),
                    id = record.get(traineesTable.ID),
                    phone = record.get(traineesTable.PHONE),
                    paymentMethod = PaymentMethod.valueOf(record.get(traineesTable.PAYMENT_METHOD)),
                    note = record.get(traineesTable.NOTE),
                    membership = MembershipTypeForMonth(
                        record.get(membershipTypeTable.NAME),
                        record.get(membershipTypeTable.PRICE),
                        record.get(traineesTable.MEMBERSHIP),
                    )
                )
            }
    }

    fun getTrainee(traineeId: Long): Trainee? {
        return sql.select(
            traineesTable.ID,
            traineesTable.NAME,
            traineesTable.PAYMENT_METHOD,
            traineesTable.PHONE,
            traineesTable.NOTE,
            traineesTable.MEMBERSHIP,
            membershipTypeTable.ID,
            membershipTypeTable.PRICE,
            membershipTypeTable.NAME
        )
            .from(traineesTable)
            .join(membershipTypeTable)
            .on(traineesTable.MEMBERSHIP.eq(membershipTypeTable.ID))
            .where(traineesTable.ID.eq(traineeId))
            .fetchOne { record ->
                Trainee(
                    name = record.get(traineesTable.NAME),
                    id = record.get(traineesTable.ID),
                    phone = record.get(traineesTable.PHONE),
                    paymentMethod = PaymentMethod.valueOf(record.get(traineesTable.PAYMENT_METHOD)),
                    note = record.get(traineesTable.NOTE),
                    membership = MembershipTypeForMonth(
                        record.get(membershipTypeTable.NAME),
                        record.get(membershipTypeTable.PRICE),
                        record.get(traineesTable.MEMBERSHIP),
                    )
                )
            }
    }

    fun addTrainee(trainee: Trainee): Boolean {
        return sql.insertInto(traineesTable)
            .set(traineesTable.NAME, trainee.name)
            .set(traineesTable.PAYMENT_METHOD, trainee.paymentMethod.name)
            .set(traineesTable.PHONE, trainee.phone)
            .set(traineesTable.NOTE, trainee.note)
            .set(traineesTable.MEMBERSHIP, trainee.membership.id)
            .execute() > 0
    }

    fun editTrainee(trainee: Trainee): Boolean {
        return sql.update(traineesTable)
            .set(traineesTable.NAME, trainee.name)
            .set(traineesTable.PAYMENT_METHOD, trainee.paymentMethod.name)
            .set(traineesTable.PHONE, trainee.phone)
            .set(traineesTable.NOTE, trainee.note)
            .set(traineesTable.MEMBERSHIP, trainee.membership.id)
            .where(traineesTable.ID.eq(trainee.id))
            .execute() > 0
    }

    fun removeTrainee(traineeId: Long): Boolean {
        return sql.deleteFrom(traineesTable)
            .where(traineesTable.ID.eq(traineeId))
            .execute() > 0
    }
}