package com.swabhav.test;

import java.util.function.Consumer;

public class FactorailConsumer {
	public static void main(String[] args) {
		Consumer<Integer> factorial =  (Integer number) -> {
			int fact = 1;
			for (int i = number; i > 0; i--) {
				fact *= i;
			};
			if(number < 0) fact = -1;
			System.out.println("factorial is "+ fact);
		};
		factorial.accept(3);
	}
}
