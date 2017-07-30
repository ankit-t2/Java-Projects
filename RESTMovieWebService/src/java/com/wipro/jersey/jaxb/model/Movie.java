package com.wipro.jersey.jaxb.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType (propOrder={"id","name","leadActor"})
public class Movie {
    
    private int id;
    private List<String> leadActor;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(List leadActor) {
        this.leadActor = leadActor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
