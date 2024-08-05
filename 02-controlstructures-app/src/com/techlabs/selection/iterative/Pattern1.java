package com.techlabs.selection.iterative;

public class Pattern1 {
	/*
	 * *
	 * * *
	 * * * *
	 */
	public static void main(String[] args) {
		int lines = 5;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			};
			System.out.println();
		}
	}
}
