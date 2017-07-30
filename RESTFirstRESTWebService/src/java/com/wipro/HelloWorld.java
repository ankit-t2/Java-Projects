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
@Path("hello")
public class HelloWorld {

    @Context
    private UriInfo context;

    /** Creates a new instance of HelloWorld */
    public HelloWorld() {
    }

    /**
     * Retrieves representation of an instance of com.wipro.HelloWorld
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getCustomPlainMsg() {
        //TODO return proper representation object
        return "<html><body bgcolor='coral'>My custom plain message</body></html>";
    }

    @GET
    @Path("world")
    @Produces("text/html")
    public String getCustomPathMsg() {
        //TODO return proper representation object
        return "<html><body bgcolor='coral'>My custom html message</body></html>";
    }

    @GET
    @Path("{world}")
    @Produces("text/plain")
    public String getCustomPathParamMsg(@PathParam("world") String str) {
        //TODO return proper representation object
        return "My custom html message " + str;
    }

    /**
     * PUT method for updating or creating an instance of HelloWorld
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
