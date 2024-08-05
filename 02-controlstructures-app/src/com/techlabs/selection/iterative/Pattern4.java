package com.techlabs.selection.iterative;

public class Pattern4 {
	/*
	1  
	2  2  
	3  3  3  
	4  4  4  4  
	 */
	public static void main(String[] args) {
		int lines = 4;
		for (int i = 1; i <= lines; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + "  ");
			};
			System.out.println();
		}
	}
}
