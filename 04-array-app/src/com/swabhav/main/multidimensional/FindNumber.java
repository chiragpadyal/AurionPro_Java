package com.swabhav.main.multidimensional;

import java.util.Scanner;

public class FindNumber {
	
	private static boolean findNumber(int[][] array, int number, int row, int columns) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++) {
				if(array[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}
	
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
		
		System.out.println("Enter number to find : ");
		int toFind = scanner.nextInt();
		
		if (findNumber(array, toFind, row, columns)) {
			System.out.println("Found Number " + toFind + " in array");
		} else {
			System.out.println("Not Found Number " + toFind + " in array");
		}
		
		scanner.close();
	}
}
