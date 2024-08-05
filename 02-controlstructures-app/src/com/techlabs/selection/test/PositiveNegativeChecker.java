package com.techlabs.selection.test;

import java.util.Scanner;

public class PositiveNegativeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		
		if (number > 1) {
			System.out.println("Number is positive");
		} else if (number < 1) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is zero");
		}
		scanner.close();
	}
}
