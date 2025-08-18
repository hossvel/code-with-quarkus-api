package com.hossvel;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/greeting")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    public String hello() {
        return "Hello from Quarkus REST";
    }


    @Path("/{name}")
    @GET
    public String name(@PathParam("name") String name) {
        return "Hello: " + name +", from Quarkus REST";
    }
}
