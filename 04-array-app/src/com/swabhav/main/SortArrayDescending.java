package com.swabhav.main;

import java.util.Scanner;

public class SortArrayDescending {
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
		
		for (int i = array.length - 1; i >= 1; i--) {
			for (int j = i-1; j >= 0; j--) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Printing sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array["+ i +"] = " + array[i]);
		}

		scanner.close();
	}
}
