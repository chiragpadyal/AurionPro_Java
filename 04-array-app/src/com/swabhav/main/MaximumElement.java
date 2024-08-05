package com.swabhav.main;

import java.util.Scanner;

public class MaximumElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array;
		int max = 0;
		System.out.println("Enter size of array: ");
		array = new int[scanner.nextInt()];
		
		System.out.println("Enter array elements :");
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter " + i + " element: ");
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}
		System.out.println("Max element is :" + max);
		scanner.close();
	}
}
