package com.swabhav.model;

public interface Shape {
	void area();
	
	default void volume() {
		System.out.println("declared in interface using default");
	}
	
	static void perimeter() {
		System.out.println("declared in interface using static");
	}
}
