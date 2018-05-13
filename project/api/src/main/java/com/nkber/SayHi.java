package com.nkber;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hi")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface SayHi {

    @Path("sayHi")
    @GET
    String sayHi(String name);
}
