package com.wipro.firstrestservice;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.annotation.XmlRootElement;

@Path("hello")
@XmlRootElement(name="rootelement")
public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getHello()
	{
		String strRet = "Hello World from First RestService";
		System.out.println(strRet);
		return strRet;
		
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloJson()
	{
		String strRet = "Hello World from First RestService. Json";
		System.out.println(strRet);
		return strRet;
		
	}

}
