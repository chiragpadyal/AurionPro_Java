package com.swabhav.main;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array;
		System.out.println("Enter size of array: ");
		array = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements :");
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Printing array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array["+ i +"] = " + array[i]);
		}
		scanner.close();
	}
}
