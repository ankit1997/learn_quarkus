package com.ankit;

import com.ankit.model.Users;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/examples")
public class ExampleResource {

    @Inject
    private CacheExample cacheExample;

    @GET
    @Path("cache/{param1}/{param2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String cacheExample(@PathParam("param1") String param1, @PathParam("param2") Integer param2) {
        long start = System.currentTimeMillis();
        String result = cacheExample.myExampleMethod(param1, param2);
        long end = System.currentTimeMillis();
        return result + " (executed in " + (end-start)/1000.0 + " seconds)";
    }

}