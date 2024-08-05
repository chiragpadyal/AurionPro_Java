package com.techlabs.selection.test;

import java.util.Scanner;

public class MaximumOfThreeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();
		System.out.println("Enter third number: ");
		int number3 = scanner.nextInt();
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("Number1 is greater which is " + number1 );
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("Number2 is greator which is " + number2);
		}else if(number3 > number1 && number3 > number2) {
			System.out.println("Number3 is greator which is " + number3);
		}else {
			System.out.println("Number are equal");
		}
		scanner.close();
	}
}
