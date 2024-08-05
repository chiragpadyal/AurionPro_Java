package com.techlabs.selection.test;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();	
		
		if(number1 > number2) {
			System.out.println("Number1 is greater than Number2 which is " + number1 );
		}else if(number1 < number2) {
			System.out.println("Number1 is less than Number2 which is " + number2);
		}else {
			System.out.println("Number1 equal to Number2");
		}
		scanner.close();
	}
}
