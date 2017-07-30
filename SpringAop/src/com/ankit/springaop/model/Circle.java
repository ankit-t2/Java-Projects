package com.ankit.springaop.model;

public class Circle extends Shape{

	private String name;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String setNameString(String name) {
		this.name = name;
		return "Updated " + name;
	}

}
