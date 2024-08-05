package com.techlabs.selection.test;

import java.util.Scanner;

public class MonthToSeason {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month number: ");
		int month_id = scanner.nextInt();
		
		switch (month_id) {
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Summer");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("Mansoon");
				break;
			case 10:
			case 11:
			case 12:
			case 1:
				System.out.println("Winter");
				break;
			default:
				System.out.println("Please give value between 1 to 12");
				break;
		}
		scanner.close();
		
	}
}
