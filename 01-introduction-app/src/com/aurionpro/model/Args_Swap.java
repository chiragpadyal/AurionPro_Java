package com.aurionpro.model;


public class Args_Swap {
	
	public static void main(String[] args) {
		int number_1 = Integer.parseInt(args[0]);
		int number_2 = Integer.parseInt(args[1]);
		
		System.out.println("Number before");
		System.out.println("Number 1:" + number_1 + "\t Number 2: " + number_2 );
		
		int temp = number_1;
		number_1 = number_2;
		number_2 = temp;
		
		System.out.println("Number After");
		System.out.println("Number 1:" + number_1 + "\t Number 2: " + number_2 );
	}

}
