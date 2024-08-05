package com.sawbhav.model;

import java.util.Scanner;

public class Rectangle {
	private int height;
	private int width;
	private Scanner scanner;
	
	public Rectangle() {
		scanner = new Scanner(System.in);
	}
	
	public Rectangle(int height, int width) {
		scanner = new Scanner(System.in);
		this.height = height;
		this.width = width;
	}
	
	public int areaOfRectangle() {
		int area = height * width;
		System.out.println("Area of rectangle is : "  + area);
		return area;
	}
	
	public void setHeight() {
		System.out.println("Enter rectange height: ");
		height = scanner.nextInt();
	}
	
	public void setWidth() {
		System.out.println("Enter rectange width: ");
		width = scanner.nextInt();
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	/*
	 * display the content
	 */
	public void display() {
		System.out.println("rectange height: " + height);
		System.out.println("rectange width: " + width);
	}
	
    private void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
    
    
	
}
