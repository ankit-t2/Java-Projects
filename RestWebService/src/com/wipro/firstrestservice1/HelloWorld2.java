package com.wipro.firstrestservice1;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("hello2")
public class HelloWorld2 {

	public HelloWorld2() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getHello()
	{
		String strRet = "Hello World from Hello2 Class";
		System.out.println(strRet);
		return strRet;
		
	}

}
