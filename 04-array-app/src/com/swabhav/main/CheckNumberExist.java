package com.swabhav.main;

import java.util.Scanner;

public class CheckNumberExist {
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
		
		System.out.println("Enter number to find: ");
		int toFind = scanner.nextInt();
		boolean isExist = false;
		
		for (int i = 0; i < array.length; i++) {
			if(toFind == array[i]) {
				isExist = true;
			}
		}
		
		if(isExist) {
			System.out.println("Number Exist");
		}else {
			System.out.println("Number Not Exist");
		}
		scanner.close();
	}
}
