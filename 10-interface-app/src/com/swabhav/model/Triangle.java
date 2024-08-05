package com.swabhav.model;

public class Triangle implements Shape {
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area Of Triangle : " + (((double)1/2) * this.base * this.height));
	}

	
}
