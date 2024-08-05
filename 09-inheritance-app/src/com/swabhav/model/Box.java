package com.swabhav.model;

public class Box {
	private int height;
	private int width;
	private int dept;
	
	
	
	
	public Box(int height, int width, int dept) {
		this.height = height;
		this.width = width;
		this.dept = dept;
	}
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
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
	
	
}
