/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro.jersey.crud.resources;

import com.wipro.jersey.crud.dao.MovieDao;
import com.wipro.jersey.crud.model.Movie;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

/**
 *
 * @author AN268536
 */
public class MovieRes {

    @Context
    UriInfo context;
    
    @Context
    Request request;

    String movieName;
    
    public MovieRes(UriInfo context, Request request, String movieName) {
        this.context = context;
        this.request = request;
        this.movieName = movieName;
    }

    public MovieRes() {
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
    public Movie getSingleMovie()
    {
        return MovieDao.instance.getModel().get(movieName);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response putMovie(JAXBElement<Movie> jaxBMovie)
    {
        Movie m = jaxBMovie.getValue();
        return putAndGetResponse(m);
    }
    
    public Response putAndGetResponse(Movie movie)
    {
        Response res;
        
        if(MovieDao.instance.getModel().containsKey(movie.getName()))
        {
            res=Response.noContent().build();
        }
        else
        {
            res = Response.created(context.getAbsolutePath()).build();
        }
        
        MovieDao.instance.getModel().put(movie.getName(), movie);
        return res;
        
    }
    
    @DELETE
    public void deleteMovie()
    {
        Movie m = MovieDao.instance.getModel().remove(movieName);
        if(m==null)
        {
             throw new RuntimeException("DELETE:Movie with "+movieName+" not found");
        }
    }
}
