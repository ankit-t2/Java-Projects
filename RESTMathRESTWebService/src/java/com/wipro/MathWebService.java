/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author AN268536
 */
@Path("MathOps")
public class MathWebService {

    @Context
    private UriInfo context;

    /** Creates a new instance of MathWebService */
    public MathWebService() {
    }

    /**
     * Retrieves representation of an instance of com.wipro.MathWebService
     * @return an instance of java.lang.String
     */
    @GET
    @Path("add/{i}/{j}")
    @Produces("text/plain")
    public String addNumbers(@PathParam("i") int i, @PathParam("j") int j) {
        //TODO return proper representation object
        return "Sum is " + (i+j);
    }

    @GET
    @Path("multiply/{i}/{j}")
    @Produces("text/plain")
    public String multNumbers(@PathParam("i") int i, @PathParam("j") int j) {
        //TODO return proper representation object
        return "Product is "+(i*j);
    }

    /**
     * PUT method for updating or creating an instance of MathWebService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
