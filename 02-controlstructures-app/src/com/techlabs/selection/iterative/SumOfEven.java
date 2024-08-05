package com.techlabs.selection.iterative;

public class SumOfEven {
	public static void main(String[] args) {
		int i =1;
		int sum = 0;
		while (i <= 100) {
			if(i%2==0) sum += i;
			i++;
		}
		System.out.println("Sum Of First Even Hundred Number " + sum);
	}
}
