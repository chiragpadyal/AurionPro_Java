package com.techlabs.selection.iterative;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int newNumber = 0;
		while(number > 0) {
			int i = 0;
			i = number % 10;
			number /= 10;
			newNumber += i;
			newNumber *= 10;
		}
		newNumber /= 10;
		
		System.out.println("The number Reverse is "+newNumber);
		
		scanner.close();
		
	}
}
