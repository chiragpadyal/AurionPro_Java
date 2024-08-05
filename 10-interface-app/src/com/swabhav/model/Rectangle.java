package com.swabhav.model;

public class Rectangle implements Shape{

	private int height;
	private int base;
	
	
	
	public Rectangle(int height, int base) {
		this.height = height;
		this.base = base;
	}


	@Override
	public void area() {
		System.out.println("Area Of Rectangle is " + (height * base));
		
	}

}
