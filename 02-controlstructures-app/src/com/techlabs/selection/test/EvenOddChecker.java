package com.techlabs.selection.test;

import java.util.Scanner;

public class EvenOddChecker {
	
	void checkIfEven(int number) {
		if(number % 2 == 0) {
			System.out.println("Is even");
		} else {
			System.out.println("Is odd");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		
		EvenOddChecker evenOddChecker = new EvenOddChecker();
		evenOddChecker.checkIfEven(number);
		scanner.close();
	}
}
