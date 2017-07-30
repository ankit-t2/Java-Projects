/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro.jersey.jaxb.model;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author AN268536
 */
@Path("movie")
public class MovieResource {

    @Context
    private UriInfo context;

    /** Creates a new instance of DictionaryResource */
    public MovieResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Movie getApplnXml() {
        
        Movie m = new Movie();
        m.setId(1);
        m.setName("Harry Potter Application XML");
        List actors = new ArrayList();
        actors.add("Harry");
        actors.add("Potter");
        actors.add("Hermoine");
        m.setLeadActor(actors);
        return m;
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public Movie getTextXml() {

        Movie m = new Movie();
        m.setId(1);
        m.setName("Harry Potter Text XML");
        List actors = new ArrayList();
        actors.add("Harry");
        actors.add("Potter");
        actors.add("Hermoine");
        m.setLeadActor(actors);
        return m;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getJson() {

        Movie m = new Movie();
        m.setId(1);
        m.setName("Harry Potter Application JSON");
        List actors = new ArrayList();
        actors.add("Harry");
        actors.add("Potter");
        actors.add("Hermoine");
        m.setLeadActor(actors);
        return m;
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
