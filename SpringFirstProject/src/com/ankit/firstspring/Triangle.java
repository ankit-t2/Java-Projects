package com.ankit.firstspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, InitializingBean, DisposableBean{

	private String type;
	private int height;
	
	public Triangle() {

		System.out.println("Inside Triangle empty constructor");
	}

	public Triangle(int height) {

		System.out.println("Inside Triangle constructor(int)");
		this.height = height;
	}

	public Triangle(String type) {

		System.out.println("Inside Triangle constructor(String)");
		this.type = type;
	}

	public Triangle(String type, int height) {

		System.out.println("Inside Triangle constructor(String,int)");
		this.type = type;
		this.height = height;
		
	}

	public Triangle(int height, String type) {

		System.out.println("Inside Triangle constructor(int,string)");
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		
		System.out.println("Inside Triangle setter for Type");
		this.type = type;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		System.out.println("Inside Triangle setter for Height");
		this.height = height;
	}
	
	public void draw()
	{
		System.out.println("Drawing " + getType() + " Triangle of height " + getHeight());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("Inside setApplicationContect() of  " + getType() + " Triangle");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Inside afterPropertiesSet() of " + getType() + " Triangle");
		
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Inside destroy() of  " + getType() + " Triangle");
		
	}

}
