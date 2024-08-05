package com.techlabs.selection.iterative;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int tempNumber = number;
		int reverseNumber = 0;
		
		number = tempNumber;

		while(number > 0) {
			int i = 0;
			i = number % 10;
			number /= 10;
			reverseNumber += i;
			reverseNumber *= 10;
		}
		reverseNumber /= 10;
		number = tempNumber;
		
		if(number==reverseNumber) System.out.println("palindrome number ");    
		else System.out.println("not palindrome");    
		
		scanner.close();
		}
}
