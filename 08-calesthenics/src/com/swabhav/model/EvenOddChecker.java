package com.swabhav.model;

import java.util.Scanner;

public class EvenOddChecker {
	
	private static boolean isEven(int number) {
		if(number % 2 == 0) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =  scanner.nextInt();
		System.out.println("Number is " + isEven(number));
		
		scanner.close();
	}
}
