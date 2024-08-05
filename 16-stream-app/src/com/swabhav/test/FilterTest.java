package com.swabhav.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,5,6,7,8,3,5,66,77,2,21);
		
		System.out.println("All Number");
		numbers.stream()
				.forEach((number)-> System.out.println("Number : " + number));
		
		System.out.println("Odd Number");
		numbers.stream()
		.filter((number) -> (number%2 != 0))
		.forEach((number)-> System.out.println("Number : " + number));
		
		System.out.println("Odd Number greater than 20");
		numbers.stream()
		.filter((number) -> (number%2 != 0))
		.filter((number) -> (number > 20))
		.forEach((number)-> System.out.println("Number : " + number));
		
		List<Integer> sortedList = 
				numbers.stream()
				.filter((number) -> (number%2 != 0))
				.filter((number) -> (number > 20))
				.collect(Collectors.toList());
		
		sortedList.stream().forEach((number)-> System.out.println("Number : " + number));
		
		
		System.out.println("Squared List");
		List<Integer> squareList = numbers.stream()
		.map((number) -> number*number)
		.collect(Collectors.toList());
		
		squareList.stream().forEach(
				(number)-> System.out.println("Number : " + number)
		);
		
		
		// reducer for sum of elements
		int sum = numbers.stream().reduce(0, ((number1, number2)-> number1+number2));
		System.out.println("Sum is : "+sum);
		
		List<Integer> sortedNumber = numbers.stream().sorted(
//				Comparator.reverseOrder()
				)
											.collect(Collectors.toList());
		
		Collections.reverse(sortedNumber);
		sortedNumber.stream()
					.forEach((num)->System.out.println("sorted num: " + num));

		
		List<Integer> topThree = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println("Top Three " + topThree);
		
//		Max number
		Optional<Integer> max = numbers.stream().max((number1, number2) -> number1-number2);
		if(max.isPresent())
		System.out.println("Max : " + max.get());
		Optional<Integer> min = numbers.stream().min((number1, number2) -> number1-number2);
		if(min.isPresent())
		System.out.println("Min : " + min.get());
		
	}
}
