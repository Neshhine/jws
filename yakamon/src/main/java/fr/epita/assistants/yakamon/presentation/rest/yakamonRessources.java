package fr.epita.assistants.yakamon.presentation.rest;


import com.google.inject.Inject;
import fr.epita.assistants.yakamon.domain.service.gameService;
import fr.epita.assistants.yakamon.presentation.api.request.startRequest;
import fr.epita.assistants.yakamon.presentation.api.response.startResponse;
import fr.epita.assistants.yakamon.utils.tile.TileType;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class yakamonRessources
{
    @Inject
    gameService gs;

    @POST
    @Path("/start")
    public Response start(startRequest request)
    {
        if (request == null || request.mapPath == null || request.mapPath.trim().isEmpty()
                || request.playerName == null || request.playerName.trim().isEmpty()) {
            return Response.status(400).entity("{\"message\": \"Invalid parameters\"}").build();
        }

        try
        {
            List<List<TileType>> tiles = gameService.startGame(request.mapPath, request.playerName);
            startResponse response = new startResponse(tiles);
            return Response.ok(response).build();
        } catch (Exception e) {
            return Response.status(400).entity("{\"message\": \"Error while starting game\"}").build();
        }
    }

}
