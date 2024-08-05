package com.techlabs.selection.iterative;

import java.util.Scanner;

public class IsNumberPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number =scanner.nextInt();
		int i = 1;
		boolean isPrime = true;
		
		while(i <= number) {
			if (number % i == 0) {
				isPrime = false;
				break;
			};
			i++;
		}
		
		if(isPrime == true)
		System.out.println("number is prime");
		else System.out.println("number is not prime");
		
		scanner.close();
	}
}
