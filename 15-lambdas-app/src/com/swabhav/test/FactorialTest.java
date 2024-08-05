package com.swabhav.test;

import com.swabhav.model.IFactorial;

public class FactorialTest {
	public static void main(String[] args) {
		IFactorial factorial = (int number) -> {
			if(number < 0) return -1;
			if(number <= 1) return 1;
			int fact = 1;
			for (int i = number; i > 0; i--) {
				fact *= i;
			};
			return fact;
		};
		System.out.println(factorial.factorial(1)); 
		
		
		
	}
	
}


