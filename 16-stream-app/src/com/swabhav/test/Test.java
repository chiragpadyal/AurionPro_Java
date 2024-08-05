package com.swabhav.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,4,5,67,8,3);
		
		Stream<Integer> numberStream = numbers.stream();
		
		numberStream.forEach(
				(Integer number) -> System.out.println("Number : " + number)
		);
	}
}
