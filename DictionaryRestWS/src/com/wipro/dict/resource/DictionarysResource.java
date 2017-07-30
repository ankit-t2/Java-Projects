package com.wipro.dict.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.wipro.dict.bean.Dictionary;
import com.wipro.dict.dao.DictionaryDao;

@Path("/dictionarys")
public class DictionarysResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	
	public DictionarysResource() {
		
		System.out.println("Inside default constructor of DictionarysResource");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dictionary> getDictionaryApplnJson()
	{
		System.out.println("Returning Application Json");
		List<Dictionary> lDictionary = new ArrayList<Dictionary>();
		lDictionary.addAll(DictionaryDao.inst.getModel().values());
		return lDictionary;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Dictionary> getDictionaryApplnXML()
	{
		System.out.println("Returning Application XML");
		List<Dictionary> lDictionary = new ArrayList<Dictionary>();
		lDictionary.addAll(DictionaryDao.inst.getModel().values());
		return lDictionary;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Dictionary> getDictionaryTextXML()
	{
		System.out.println("Returning Text XML");
		List<Dictionary> lDictionary = new ArrayList<Dictionary>();
		lDictionary.addAll(DictionaryDao.inst.getModel().values());
		return lDictionary;
	}

	@GET
	@Path("/count")
	@Produces(MediaType.APPLICATION_XML)
	public String getDictionaryCount()
	{
		System.out.println("Returning Count");
		int count = DictionaryDao.inst.getModel().size();
		
		return String.valueOf(count);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_XML)
	public Dictionary addDictionary(@FormParam("term") String term, @FormParam("definition") String definition)
	{
		
		Dictionary newDict = new Dictionary(term,definition);
		DictionaryDao.inst.getModel().put(term, newDict);
		return newDict;
		
	}
	
	@Path("{term}")
	public DictionaryResource getDictionary(@PathParam("term") String term)
	{
		return new DictionaryResource(uriInfo,request,term);
	}

}
