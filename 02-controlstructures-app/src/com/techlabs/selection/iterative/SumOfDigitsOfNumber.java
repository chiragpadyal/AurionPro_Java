package com.techlabs.selection.iterative;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int sum = 0;
		
		while(number > 0) {
			int i = 0;
			i = number % 10;
			number /= 10;
			sum += i;
		}
		
		System.out.println("Sum Of Digits Of Number is: " + sum);
		
		scanner.close();
		
	}
}
