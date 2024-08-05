package com.aurionpro.model;

import java.util.Scanner;

public class Operations {
	
	int addition(int a, int b) {
		return a + b;
	}
	
	int multiplication(int a, int b) {
		return a * b;
	}
	
	int subtraction(int a, int b) {
		return a - b;
	}
	
	int division(int a, int b) {
		if (a == 0) return 0;
		return a / b;
	}
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		
		Operations ops = new Operations();
		
		System.out.println(
				"Addition :" + ops.addition(a,b) +
				" \n"  +
				"Subtraction :" + ops.subtraction(a,b) +
				" \n" +
				"Multiplication :" + ops.multiplication(a,b) +
				" \n" +
				"Division :" + ops.division(a,b) +
				" \n" 
				);
		
		sc.close();
		
	}
}
