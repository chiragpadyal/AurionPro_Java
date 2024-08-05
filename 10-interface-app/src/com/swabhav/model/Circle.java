package com.swabhav.model;

public class Circle implements Shape{
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public void area() {
		System.out.println("Area Of Circle is " + (3.14 * radius * radius));
	}
	
	
}
