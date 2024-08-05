package com.swabhav.test;

import java.util.function.Consumer;

public class SquareConsumer {
	public static void main(String[] args) {
		Consumer<Integer> square = (Integer number) -> System.out.println("Square of number is : " +number*number);
		square.accept(3);
	}
}
