package com.swabhav.ocp.voilation.test;

import com.swabhav.ocp.voilation.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 5);
		int area = rectangle.getArea();
		
		System.out.println("Area Of Rectangle is : " + area);
	}
}
