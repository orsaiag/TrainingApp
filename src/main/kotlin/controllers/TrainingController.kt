package controllers

import Training
import services.TrainingService
import java.time.LocalDate
import java.time.format.DateTimeParseException
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/training")
class TrainingController(private val service: TrainingService) {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addTraining(training: Training): Response {
        val response = service.addTraining(training)
        return Response.ok(response).build()
    }

    @GET
    @Path("/byDate")
    @Produces(MediaType.APPLICATION_JSON)
    fun getTrainingsByDate(@QueryParam("date") dateStr: String?): Response {
        val date = try {
            dateStr?.let { LocalDate.parse(it) } ?: return Response.status(Response.Status.BAD_REQUEST)
                .entity("Invalid or missing date").build()
        } catch (e: DateTimeParseException) {
            return Response.status(Response.Status.BAD_REQUEST)
                .entity("Invalid date format. Expected format: yyyy-MM-dd").build()
        }

        val response = service.getTrainingsByDate(date)
        return Response.ok(response).build()
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getTrainings(): Response {
        val response = service.getTrainings()
        return Response.ok(response).build()
    }

    @GET
    @Path("/{trainingId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getTraining(@PathParam("trainingId") trainingId: Long): Response {
        val response = service.getTraining(trainingId)
        return Response.ok(response).build()
    }

    @DELETE
    @Path("/{trainingId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun removeTraining(@PathParam("trainingId") trainingId: Long): Response {
        val response = service.removeTraining(trainingId)
        return Response.ok(response).build()
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun editTraining(training: Training): Response {
        val response = service.editTraining(training)
        return Response.ok(response).build()
    }

}