package controllers

import services.RegisterService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/traineeInTraining")
class TraineeInTrainingController(private val service: RegisterService) {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun register(request: RegisterRequest): Response {
        val response = service.register(request.trainingId, request.traineeId)
        return Response.ok(response).build()
    }

    @GET
    @Path("/{trainingId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getRegisterTrainee(@PathParam("trainingId") trainingId: Long): Response {
        val response = service.getRegisteredTrainee(trainingId)
        return Response.ok(response).build()
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    fun cancelRegisterTrainee(request: RegisterRequest): Response {
        val response = service.cancel(request.trainingId, request.traineeId)
        return Response.ok(response).build()
    }


    data class RegisterRequest(
        val trainingId: Long,
        val traineeId: Long
    )
}

