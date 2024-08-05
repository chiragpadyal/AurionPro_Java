package com.sawbhav.model;

public class Box {

	// default is like public but for same package
	private int width;
	private int dept;
	private int height;
	
	//default
	public Box() {
		width = 10;
		height = 10;
		dept = 10;
	}
	
	//parameterized
	public Box(int width, int height, int dept) {
		this.width = width;
		this.height = height;
		this.dept = dept;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "width " + width + " ,hieght " + height + " ,dept " + dept;
	}
	
	
	
}
