package com.wipro.jersey.crud.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType (propOrder={"id","name","leadActor"})
public class Movie {
    
    private int id;
    private String leadActor;
    private String name;

    public Movie() {
    }

    public Movie(int id, String leadActor, String name) {
        this.id = id;
        this.leadActor = leadActor;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
