package com.techlabs.exception;

public class AgeNotFoundException extends RuntimeException{
	
	public AgeNotFoundException(int age) {
		super("Age Cannot be below " + age + "!");
	}
}
