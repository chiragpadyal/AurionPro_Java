package com.swabhav.model;

import java.util.Scanner;

public class Factorial {
	
	private static int factorialCalculator(int number) {
		if(number < 0) return -1;
		if(number == 1 || number == 0) {
			return 1;
		}
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =  scanner.nextInt();
		
		scanner.close();
		int fact = factorialCalculator(number);
		if(fact==-1) {
			System.out.println("Factorial of Number is undefined");
			return;
		}
		System.out.println("Factorial of Number is " + factorialCalculator(number));
	}
}
