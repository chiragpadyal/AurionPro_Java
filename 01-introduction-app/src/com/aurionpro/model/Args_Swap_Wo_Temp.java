package com.aurionpro.model;

public class Args_Swap_Wo_Temp {
	public static void main(String[] args) {
		int number_1 = Integer.parseInt(args[0]);
		int number_2 = Integer.parseInt(args[1]);
		
		
		System.out.println("Number before");
		System.out.println("Number 1:" + number_1 + "\t Number 2: " + number_2 );
		
		number_1 = number_1 + number_2; 
		number_2 = number_1 - number_2; // a + b - b
		number_1 = number_1 - number_2; // a + b - a
		
		System.out.println("Number After");
		System.out.println("Number 1:" + number_1 + "\t Number 2: " + number_2 );
	}
}
