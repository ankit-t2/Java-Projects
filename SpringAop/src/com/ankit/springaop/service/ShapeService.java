package com.ankit.springaop.service;

import com.ankit.springaop.model.*;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	
	public ShapeService() {
		// TODO Auto-generated constructor stub
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
