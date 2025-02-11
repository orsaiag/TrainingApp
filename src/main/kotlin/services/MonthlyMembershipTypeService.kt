package services

import com.example.generated.tables.pojos.MembershipTypeForMonth
import daos.MonthlyMembershipTypeDao

class MonthlyMembershipTypeService(private val dao: MonthlyMembershipTypeDao) {

    fun getMemberships(): List<MembershipTypeForMonth>{
        return dao.getMemberships()
    }

    fun addMembership(membershipType: MembershipTypeForMonth): Boolean {
        return dao.addMembership(membershipType)
    }

    fun removeMembership(membershipId: Long): Boolean {
        return dao.removeMembership(membershipId)
    }

    fun getMembership(membershipId: Long): MembershipTypeForMonth? {
        return dao.getMembership(membershipId)
    }

    fun editMembership(membershipType: MembershipTypeForMonth): Boolean {
        return dao.editMembership(membershipType)
    }
}