package com.techlabs.selection.iterative;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number =scanner.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial *= i;			
		}
		System.out.println("Factorial of number " + number + " is "+ factorial);
		
		scanner.close();
	}
}
