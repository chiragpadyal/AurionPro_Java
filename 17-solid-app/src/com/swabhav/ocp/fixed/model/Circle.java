package com.swabhav.ocp.fixed.model;

public class Circle implements Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (3.14 * this.radius * this.radius);
	}
}
