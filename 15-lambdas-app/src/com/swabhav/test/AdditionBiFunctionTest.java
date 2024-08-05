package com.swabhav.test;

import java.util.function.BiFunction;

public class AdditionBiFunctionTest {

	
	public static void main(String[] args) {
		
		AdditionBiFunctionTest obj = new AdditionBiFunctionTest();
		BiFunction<Integer, Integer, Integer> additionBiFunction = obj::addNumber;
		System.out.println(
				additionBiFunction.apply(3, 3)				
				);
	}
	
	public Integer addNumber(Integer num1 , Integer num2) {
		return num1+num2;
	}
}
