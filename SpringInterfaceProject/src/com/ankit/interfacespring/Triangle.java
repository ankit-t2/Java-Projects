package com.ankit.interfacespring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, ApplicationContextAware, InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle() {

		System.out.println("Inside Triangle empty constructor");
	}

	public Triangle(Point pointA,Point pointB,Point pointC)
	{
		System.out.println("Inside Triangle 3 arg constructor");
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		
	}
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw()
	{
		System.out.println("Drawing a triangle with points : PointA = " + pointA + " PointB = " + pointB + " PointC = " + pointC);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("Inside setApplicationContect() of  Triangle");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Inside afterPropertiesSet() of Triangle");
		
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Inside destroy() of Triangle");
		
	}

}
