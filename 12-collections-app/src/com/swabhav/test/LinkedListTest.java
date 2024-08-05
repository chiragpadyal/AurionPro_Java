package com.swabhav.test;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		
		linkedList.add("om");
		linkedList.add("joe");
		linkedList.addFirst("firsty");
		linkedList.addLast("lasty");
		
		for (String string : linkedList) {
			System.out.println(linkedList);
		}
	}
}
