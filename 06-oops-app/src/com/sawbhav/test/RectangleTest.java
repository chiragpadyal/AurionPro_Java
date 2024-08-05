package com.sawbhav.test;

import com.sawbhav.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 6);
		rectangle.display();
		rectangle.areaOfRectangle();
		
		System.out.println("--------- From user ------");
		
		rectangle.setHeight();
		rectangle.setWidth();
		rectangle.display();
		
		rectangle.areaOfRectangle();
	}
}
