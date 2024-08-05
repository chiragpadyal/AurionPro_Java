package com.swabhav.model;

public class Demo {
	private int a = 1;
	static private int b = 1;
	private int c = 1;
	
	public Demo(){
		System.out.println("const");
	}
	
	public void increment() {
		a++;
		b++;
		c++;
	}


	@Override
	public String toString() {
		return "a=" + a + ", b=" + b + ", c=" + c;
	}

	{
		System.out.println("block");
	}
}
