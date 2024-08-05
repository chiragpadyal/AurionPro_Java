package com.techlabs.selection.iterative;

import java.util.Scanner;

public class NumberTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number =scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}
		
		scanner.close();
	}
}
