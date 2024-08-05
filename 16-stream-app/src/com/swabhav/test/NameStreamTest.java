package com.swabhav.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStreamTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");

		List<String> output;

		output = names.stream().limit(3).sorted((name1, name2) -> name1.compareTo(name2)).collect(Collectors.toList());

		System.out.println("first 3 students sorted in ascending order " + output);

		output = names.stream().limit(3).filter((name) -> {
			return (name.contains("a"));
		}).sorted((name1, name2) -> name1.compareTo(name2)).collect(Collectors.toList());

		System.out.println("first 3 students sorted in ascending order if it contains 'a' " + output);
		// reverse sorted
		output = names.stream().sorted((name1, name2) -> (name1.compareTo(name2) * -1)).collect(Collectors.toList());
		System.out.println("student in descending order " + output);

		output = names.stream()
				.map((name) -> name.substring(0,3))
				.collect(Collectors.toList());
		System.out.println("First there char "+ output);
		
		output = names.stream().filter((name) -> {
			return (name.length() <= 4);
		}).collect(Collectors.toList());
		System.out.println("less than 4 char " + output);
	}
}
