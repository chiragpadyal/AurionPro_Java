package com.swabhav.test;

public class TypeCasting {
	public static void main(String[] args) {
		int number = (int) 3.0; //explicit
		double number2 = 3; // implicit
		float number3 = 3;
		char ascii = 777; //implicit
		byte a = 10; 
		// type promotion as adding expression promote to int
		byte b = (byte) (a + 10); 
		long longNumber = (long) 10f;
		
		System.out.println(ascii);
	}
}
