package com.swabhav.main.multidimensional;

import java.util.Scanner;

public class MulitArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array;
		System.out.println("Enter size of rows: ");
		int row = scanner.nextInt();
		
		System.out.println("Enter size of columns: ");
		int columns = scanner.nextInt();
		
		array = new int[row][columns];
		
		System.out.println("Enter array elements :");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.println("Enter row " + i + " and column " + j + " element");
				array[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Printing array: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
		scanner.close();
	}
}
