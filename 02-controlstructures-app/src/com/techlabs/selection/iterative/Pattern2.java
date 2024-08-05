package com.techlabs.selection.iterative;

public class Pattern2 {
	/*
	1  
	2  3  
	4  5  6  
	7  8  9  10 
	 */
	public static void main(String[] args) {
		int lines = 4;
		int number = 1;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(number + "  ");
				number++;
			};
			System.out.println();
		}
	}
}
