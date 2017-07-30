package com.wipro.jersey.crud.resources;

import com.wipro.jersey.crud.dao.MovieDao;
import com.wipro.jersey.crud.model.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

@Path("movie")
public class MovieResources {

    @Context
    UriInfo context;
    
    @Context
    Request request;

    /** Creates a new instance of MovieResources */
    public MovieResources() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getApplnXml() {
        //TODO return proper representation object
        List movies = new ArrayList();
        movies.addAll(MovieDao.instance.getModel().values());
        return movies;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getApplnJSON() {
        //TODO return proper representation object
        List movies = new ArrayList();
        movies.addAll(MovieDao.instance.getModel().values());
        return movies;
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> getTextXML() {
        //TODO return proper representation object
        List movies = new ArrayList();
        movies.addAll(MovieDao.instance.getModel().values());
        return movies;
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCount() {
        //TODO return proper representation object
        int count = MovieDao.instance.getModel().size();
        return String.valueOf(count);
    }
    
    @Path("{movieName}")
    public MovieRes getMovie(@PathParam("movieName") String movieName)
    {
        return new MovieRes(context,request,movieName);
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void postXml(@FormParam("id") int id, @FormParam("movieName") String movieName, 
            @FormParam("leadActor") String leadActor) 
    {
        Movie newMovie = new Movie(id, leadActor, movieName);
        MovieDao.instance.getModel().put(movieName, newMovie);
        
    }
}
