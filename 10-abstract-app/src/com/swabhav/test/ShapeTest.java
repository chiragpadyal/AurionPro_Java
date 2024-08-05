package com.swabhav.test;



import com.swabhav.model.Circle;
import com.swabhav.model.Shape;
import com.swabhav.model.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		Shape circle = new Circle(3);
		
		Shape rectangle = new Rectangle(4,5);
		
		rectangle.area();
		circle.area();
	}
}
