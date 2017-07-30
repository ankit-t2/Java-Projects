package com.ankit.firstspring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements ApplicationContextAware{

	Point pointA;
	Point pointB;
	Point pointC;
	Point pointD;
	
	public Square() {

		System.out.println("Inside Square constructor");
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public void draw()
	{
		System.out.println("Drawing " + pointA + "," + pointB + "," + pointC + "," + pointD);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Inside setApplicationContext of Square class.");
	}
	
	public int myInit()
	{
		System.out.println("Inside my custom init function in Square class");
		return 0;
	}

	public int cleanUp()
	{
		System.out.println("Inside my custom cleanup function in Square class");
		return 0;
	}

}
