package com.swabhav.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("amit");
		array.add("bob");
		System.out.println(array);
		
		array.add(1, "joe");
		System.out.println(array);
		
		System.out.println("The string 'amit' exist is " + array.contains("amit"));
		
		array.set(2, "doe");
		System.out.println(array);
		
		System.out.println("for loop simple -> ");
		for (int i = 0; i < array.size(); i++) System.out.println(array.get(i));
		System.out.println("for loop advance -> ");
		for (String name : array) System.out.println(name);
		System.out.println("Iterator -> ");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()) System.out.println(iterator.next());
		System.out.println("ListIterator -> ");
		ListIterator<String> listIterator = array.listIterator();
		System.out.println("a. forward ->");
		while(listIterator.hasNext()) System.out.println(listIterator.next());
		System.out.println("b. backward ->");
		while(listIterator.hasPrevious()) System.out.println(listIterator.previous());
	}
}
