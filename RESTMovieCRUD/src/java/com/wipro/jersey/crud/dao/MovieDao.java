/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro.jersey.crud.dao;

import com.wipro.jersey.crud.model.Movie;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AN268536
 */
public enum MovieDao {
    
    instance;
    
    private Map<String,Movie> contentProvider=new HashMap();
    private MovieDao()
    {
        Movie movie=new Movie(1,"Harry","Harry Potter");
        contentProvider.put("Harry Potter",movie);
        
        movie = new Movie(2,"Shahrukh","KKHH");
        contentProvider.put("KKHH",movie);        

        movie = new Movie(2,"Salman","Sultan");
        contentProvider.put("Sultan",movie);        
    }
    public Map<String,Movie> getModel()
    {
        return contentProvider;
    } 
}
