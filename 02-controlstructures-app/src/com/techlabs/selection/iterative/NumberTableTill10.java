package com.techlabs.selection.iterative;

import java.util.Scanner;

public class NumberTableTill10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
