package com.swabhav.test;

import java.util.function.Function;

public class SquareFunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> sqrFuncation = (Integer number) -> number*number;
		
		System.out.println("Square of number is " + sqrFuncation.apply(7));
	}
}
