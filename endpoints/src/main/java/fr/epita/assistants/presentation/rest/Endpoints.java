package fr.epita.assistants.presentation.rest;

import fr.epita.assistants.presentation.rest.response.HelloResponse;
import fr.epita.assistants.presentation.rest.response.ReverseResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class Endpoints
{
    @GET
    @Path("/hello/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(@PathParam("name") String name)
    {
        HelloResponse hr = new HelloResponse("hello " + name);
        return Response.ok(hr).build();
    }

    @POST
    @Path("/reverse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response reverse(ReverseResponse reverseReq)
    {
        if (reverseReq == null || reverseReq.content == null)
        {
            return Response.status(400).build();
        }

        String original = reverseReq.content;
        String reversed = new StringBuilder(original).reverse().toString();

        ReverseResponse response = new ReverseResponse(original, reversed);
        return Response.ok(response).build();
    }


}


