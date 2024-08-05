package com.swabhav.model;

public class Reference {
	public Reference() {
		System.out.println("Inside constructor");
	}
	
	public Reference(Integer i) {
		System.out.println("Inside constructor");
	}

	public void print() {
		System.out.println("Inside Reference");
	}
	
	public static void staticPrint() {
		System.out.println("Inside Static Print");
	}
}
