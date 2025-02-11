package controllers

import Trainee
import services.TraineeService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/trainee")
class TraineeController(private val service: TraineeService) {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addTrainee(trainee: Trainee): Response {
        val response = service.addTrainee(trainee)
        return Response.ok(response).build()
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getTrainee(): Response {
        val response = service.getTrainee()
        return Response.ok(response).build()
    }

    @GET
    @Path("/{traineeId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getTrainee(@PathParam("traineeId") traineeId: Long): Response {
        val response = service.getTrainee(traineeId)
        return Response.ok(response).build()
    }


    @DELETE
    @Path("/{traineeId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun removeTrainee(@PathParam("traineeId") traineeId: Long): Response {
        val response = service.removeTrainee(traineeId)
        return Response.ok(response).build()
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun editTrainee(trainee: Trainee): Response {
        val response = service.editTrainee(trainee)
        return Response.ok(response).build()
    }
}