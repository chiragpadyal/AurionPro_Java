package com.swabhav.test;

import com.swabhav.model.ISayable;

public class SayTest {
	public static void main(String[] args) {
		ISayable sayable = () -> System.out.println(" i am inside sayable ");
		sayHello(sayable);
	}
	private static void sayHello(ISayable sayable) {
		sayable.say();
	}
}


