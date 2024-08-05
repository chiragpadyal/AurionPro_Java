package com.swabhav.test;

import com.swabhav.model.IAddition;

public class AdditionTest {
	public static void main(String[] args) {
		IAddition adder = (int number1 ,int number2) -> number1+number2;
		System.out.println("addition is: " + adder.add(2, 3));
	}
	
}


