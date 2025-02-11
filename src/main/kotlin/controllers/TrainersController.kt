package controllers

import com.example.generated.tables.pojos.Trainer
import services.TrainersService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/trainer")
class TrainersController(private val service: TrainersService) {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getTrainers(): Response {
        val response = service.getTrainers()
        return Response.ok(response).build()
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addTrainer(trainer: Trainer): Response {
        val response = service.addTrainer(trainer)
        return Response.ok(response).build()
    }

    @GET
    @Path("/{trainerId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getTrainer(@PathParam("trainerId") trainerId: Long): Response {
        val response = service.getTrainer(trainerId)
        return Response.ok(response).build()
    }

    @DELETE
    @Path("/{trainerId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun removeTrainer(@PathParam("trainerId") trainerId: Long): Response {
        val response = service.removeTrainer(trainerId)
        return Response.ok(response).build()
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun editTrainer(trainer: Trainer): Response {
        val response = service.editTrainer(trainer)
        return Response.ok(response).build()
    }
}