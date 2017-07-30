package com.ankit.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public DrawingApp() {

	}

	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle1 = (Triangle)factory.getBean("triangle");
		triangle1.draw();
		
		System.out.println("**************************");
		
		Triangle triangle2 = (Triangle)factory.getBean("triangle");
		triangle2.draw();
		
		
		System.out.println("**************************");
		
		triangle1.draw();
		
		
		System.out.println("**************************");
		
		Square square = (Square)factory.getBean("square");
		square.draw();

		
		System.out.println("**************************");
		
		factory.getBean("firstPoint");
		
		
		System.out.println("**************************");
		
		factory.close();
	}

}
