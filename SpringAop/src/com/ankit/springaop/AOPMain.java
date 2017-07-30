package com.ankit.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ankit.springaop.model.Circle;
import com.ankit.springaop.model.Shape;
import com.ankit.springaop.service.ShapeService;

public class AOPMain {

	public AOPMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		ShapeService shapeService1 = new ShapeService();
		
		System.out.println("Class name for shapeService object is " + shapeService.getClass().getName());
		System.out.println("Class name for shapeService object is " + shapeService1.getClass().getName());


		String newName = shapeService.getCircle().setNameString("Dummy Name");
		
		System.out.println("The value actually caught after modifying from aspect in Main method is " + newName);
	}

}
