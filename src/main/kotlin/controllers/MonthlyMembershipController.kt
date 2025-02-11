package controllers

import com.example.generated.tables.pojos.MembershipTypeForMonth
import services.MonthlyMembershipTypeService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/membershipType")
class MonthlyMembershipController(private val service: MonthlyMembershipTypeService) {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addMembership(membershipType: MembershipTypeForMonth): Response {
        val response = service.addMembership(membershipType)
        return Response.ok(response).build()
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getMemberships(): Response {
        val response = service.getMemberships()
        return Response.ok(response).build()
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getMembership(@PathParam("id") membershipId: Long): Response {
        val response = service.getMembership(membershipId)
        return Response.ok(response).build()
    }


    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun removeMembership(@PathParam("id") membershipId: Long): Response {
        val response = service.removeMembership(membershipId)
        return Response.ok(response).build()
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun editMembership(membershipType: MembershipTypeForMonth): Response {
        val response = service.editMembership(membershipType)
        return Response.ok(response).build()
    }
}