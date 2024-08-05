package com.swabhav.test;

import com.swabhav.model.ITest;
import com.swabhav.model.Reference;

public class ReferenceTest {
	public static void main(String[] args) {
		ITest test = Reference::new;
		method(test);
		
		ITest test1 = Reference::staticPrint;
		method(test1);
		
		Reference obj = new Reference();
		ITest test2 = obj::print;
		method(test2);
	}
	
	private static void method(ITest test) {
		test.display();
	}
}
