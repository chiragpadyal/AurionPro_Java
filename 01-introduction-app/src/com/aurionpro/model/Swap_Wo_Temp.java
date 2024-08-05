package com.aurionpro.model;

import java.util.Scanner;

public class Swap_Wo_Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_1 = sc.nextInt();
		int number_2 = sc.nextInt();
		
		System.out.println("Number before");
		System.out.println("Number 1:" + number_1 + "\t Number 2: " + number_2 );
		
		number_1 = number_1 + number_2; 
		number_2 = number_1 - number_2; // a + b - b
		number_1 = number_1 - number_2; // a + b - a
		
		System.out.println("Number After");
		System.out.println("Number 1:" + number_1 + "\t Number 2: " + number_2 );
		
		sc.close();
	}
}
