package com.swabhav.ocp.fixed.test;

import com.swabhav.ocp.fixed.model.Circle;
import com.swabhav.ocp.fixed.model.Rectangle;
import com.swabhav.ocp.fixed.model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(4, 5);
		double area = rectangle.getArea();
			
		System.out.println("Area Of Rectangle is : " + area);

		Shape circle = new Circle(4);
		area = circle.getArea();
		
		System.out.println("Area Of Circle is : " + area);
	}
}
