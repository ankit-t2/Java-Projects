package com.ankit.interfacespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingInterfaceApp {

	public DrawingInterfaceApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/ankit/interfacespring/resource/spring.xml");
		
		Shape shape = (Shape)factory.getBean("triangle");
		shape.draw();
		
		System.out.println("**************************");
		
		Square square = (Square)factory.getBean("square");
		square.draw();

		System.out.println("**************************");
		

	}

}
