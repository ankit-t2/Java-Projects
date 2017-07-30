package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	private String name;
	
	public String execute() throws Exception {
		
		System.out.println("Inside execute()");
		if ("SECRET".equals(name))
		{
			return SUCCESS;
		}else{
			return ERROR;  
		}
	}

	public String getName() {
		System.out.println("Inside getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName");
		this.name = name;
	}
	
	public String getSubject() {
		System.out.println("Inside getSubject");
		return "Subject";
	}
}
