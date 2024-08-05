package com.techlabs.selection.iterative;

public class SumOfFIrst100 {
	public static void main(String[] args) {
		int i =1;
		int sum = 0;
		while (i <= 100) sum += i++;
		System.out.println("Sum Of First Hundred Number " + sum);
	}
}
