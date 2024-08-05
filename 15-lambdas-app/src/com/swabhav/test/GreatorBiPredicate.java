package com.swabhav.test;

import java.util.function.BiPredicate;

public class GreatorBiPredicate {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> greatorNumberPredicate = (Integer number1,
				Integer number2) -> (number1 > number2);
		System.out.println("Is first number greator : " + greatorNumberPredicate.test(7, 4));
	}
}
