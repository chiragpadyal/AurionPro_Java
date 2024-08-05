package com.swabhav.main;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array;
		int sum = 0;
		System.out.println("Enter size of array: ");
		array = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements :");
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum of element is: " + sum);
		scanner.close();
	}
}
