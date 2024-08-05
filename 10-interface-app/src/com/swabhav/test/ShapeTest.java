package com.swabhav.test;



import com.swabhav.model.Circle;
import com.swabhav.model.Shape;
import com.swabhav.model.Triangle;
import com.swabhav.model.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape shape;
		shape = new Circle(3);
		shape.area();
		shape.volume(); //default
		Shape.perimeter(); //static
		
		shape = new Rectangle(4,5);
		shape.area();
		
		shape = new Triangle(2,2);
		shape.area();
		
	}
}
