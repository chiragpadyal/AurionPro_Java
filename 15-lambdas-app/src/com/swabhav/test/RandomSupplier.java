package com.swabhav.test;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
	public static void main(String[] args) {
		Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);
		System.out.println("Random Number is : "  + randomNumberSupplier.get());
	}
}
