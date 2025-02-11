package daos

import com.example.generated.tables.MembershipTypeForMonth as MembershipTable
import com.example.generated.tables.daos.MembershipTypeForMonthDao
import com.example.generated.tables.pojos.MembershipTypeForMonth
import config.Database.sql

class MonthlyMembershipTypeDao {
    private val membershipTypeTable = MembershipTable.MEMBERSHIP_TYPE_FOR_MONTH

    fun getMemberships(): List<MembershipTypeForMonth> {
        return sql.select(membershipTypeTable.ID, membershipTypeTable.NAME, membershipTypeTable.PRICE)
            .from(membershipTypeTable)
            .fetchInto(MembershipTypeForMonth::class.java)
    }

    fun getMembership(membershipId: Long): MembershipTypeForMonth? {
        return sql.select(membershipTypeTable.ID, membershipTypeTable.NAME, membershipTypeTable.PRICE)
            .from(membershipTypeTable)
            .where(membershipTypeTable.ID.eq(membershipId))
            .fetchOne{ record ->
                MembershipTypeForMonth(
                    record.get(membershipTypeTable.NAME),
                    record.get(membershipTypeTable.PRICE),
                    record.get(membershipTypeTable.ID),
                )
            }
    }

    fun addMembership(membershipTypeForMonth: MembershipTypeForMonth): Boolean {
        return sql.insertInto(membershipTypeTable)
            .set(membershipTypeTable.NAME, membershipTypeForMonth.name)
            .set(membershipTypeTable.PRICE, membershipTypeForMonth.price.toLong())
            .execute() > 0
    }

    fun removeMembership(membershipId: Long): Boolean {
        return sql.deleteFrom(membershipTypeTable)
            .where(membershipTypeTable.ID.eq(membershipId))
            .execute() > 0
    }

    fun editMembership(membershipTypeForMonth: MembershipTypeForMonth): Boolean {
        return sql.update(membershipTypeTable)
            .set(membershipTypeTable.NAME, membershipTypeForMonth.name)
            .set(membershipTypeTable.PRICE, membershipTypeForMonth.price.toLong())
            .where(membershipTypeTable.ID.eq(membershipTypeForMonth.id))
            .execute() > 0
    }
}