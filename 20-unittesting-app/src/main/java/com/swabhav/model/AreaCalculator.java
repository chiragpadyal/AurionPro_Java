package com.swabhav.model;

public class AreaCalculator {
	
	public double calculateAreaOfCircle(int radius) {
		return 3.14 * radius * radius;
	}
	
	public double calculateAreaOfSquare(int side) {
		return side* side;
	}
	
	public double calculateAreaOfRectangle(int length, int height) {
		return length * height;
	}
	
	public double calculateAreaOfTriangle(int length, int height) {
		return 0.5 * length * height;
	}
}
