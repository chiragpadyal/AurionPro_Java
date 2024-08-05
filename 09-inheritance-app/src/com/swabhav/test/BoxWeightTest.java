package com.swabhav.test;

import java.util.Scanner;

import com.swabhav.model.BoxWeight;

public class BoxWeightTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height, width, dept and weight: ");
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		int dept = scanner.nextInt();
		int weight= scanner.nextInt();
		
		BoxWeight boxWeight = new BoxWeight(height, width, dept, weight);
		System.out.println(boxWeight);
		scanner.close();
	}
	

}
