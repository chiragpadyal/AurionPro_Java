package com.techlabs.selection.iterative;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int tempNumber = number;
		int numberOfDigits = 0;
		int ArmStrongSum = 0;
		
		while(number > 0) {
			number /= 10;
			numberOfDigits += 1;
		}
		
		number = tempNumber;
		
		while(number > 0) {
			int i = 0;
			i = number % 10;
			number /= 10;
			ArmStrongSum += Math.pow(i, numberOfDigits);
		}
		
		if(ArmStrongSum == tempNumber) {
			System.out.println("The number "+tempNumber+" is Armstrong");
		} else {
			System.out.println("The number is not Armstrong");
		}
		
		scanner.close();
		
	}
}
