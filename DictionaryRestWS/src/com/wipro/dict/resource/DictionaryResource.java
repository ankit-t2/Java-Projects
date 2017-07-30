package com.wipro.dict.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBElement;

import com.wipro.dict.bean.Dictionary;
import com.wipro.dict.dao.DictionaryDao;

@Path("/dictionary")
public class DictionaryResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	String term;
	
	public DictionaryResource() {
		
	}

	public DictionaryResource(UriInfo uriInfo, Request request, String term) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.term = term;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Dictionary getDictionary()
	{
		Dictionary retDictionary = DictionaryDao.inst.getModel().get(term);
		
		if(retDictionary == null)
			throw new RuntimeException("GET:Dictionary for " + term + " not found!");
		
		return retDictionary;
	}

	@GET
	@Produces({MediaType.TEXT_XML})
	public Dictionary getDictionaryXML()
	{
		Dictionary retDictionary = DictionaryDao.inst.getModel().get(term);
		
		if(retDictionary == null)
			throw new RuntimeException("GET:Dictionary for " + term + " not found!");
		
		return retDictionary;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Dictionary putDicionary(JAXBElement<Dictionary> jDictionary)
	{
		Response res;
		
		Dictionary putDictionary = jDictionary.getValue();

		if(DictionaryDao.inst.getModel().containsKey(putDictionary.getTerm()))
		{
			res = Response.noContent().build();
		}
		else
		{
			res = Response.created(uriInfo.getAbsolutePath()).build();
		}
			
		DictionaryDao.inst.getModel().put(putDictionary.getTerm(), putDictionary);
		
		return putDictionary;
		
	}
	
	@DELETE
	public void deleteDicttionary()
	{
		Dictionary removedDict = DictionaryDao.inst.getModel().remove(term);
		
		if(removedDict == null)
			throw new RuntimeException("DELETE: Dictionary for " + term + " not found for deletion!");
	}

}
