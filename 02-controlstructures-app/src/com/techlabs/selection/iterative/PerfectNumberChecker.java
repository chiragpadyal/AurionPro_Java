package com.techlabs.selection.iterative;

import java.util.Scanner;

public class PerfectNumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number =scanner.nextInt();
		int tempNumber = number;
		int i = 1;
		int sum = 0;
		
		while(i <= tempNumber / 2) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}
		if(sum == number)
		System.out.println("number is perfect");
		else System.out.println("number is not perfect");
		
		scanner.close();
	}
	
}
