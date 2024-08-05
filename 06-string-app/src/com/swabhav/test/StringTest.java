package com.swabhav.test;

public class StringTest {
	public static void main(String[] args) {
		
		// stored in string pool which is in heap
		String name1 = "hari";
		String name2 = "hari";
		// stored in heap
		String name3 = new String("hari");
		String name4 = new String("hari");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		// same hash for same string
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		
		System.out.println(name2 == name3);
		System.out.println(name1 == name2);
		System.out.println(name4 == name3);
		
		
		// String Buffer (mutable)
		
		StringBuffer name5 = new StringBuffer("chirag");
		System.out.println(name5.hashCode());
		name5.append(" padyal");
		System.out.println(name5);
		System.out.println(name5.hashCode());
		
		// String Builder (mutable)
		
		StringBuilder name6 = new StringBuilder("chirag");
		System.out.println(name6.hashCode());
		name6.append(" padyal");
		System.out.println(name6);
		System.out.println(name6.hashCode());
		
		
	}
}
