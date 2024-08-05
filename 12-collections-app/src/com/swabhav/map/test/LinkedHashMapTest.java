package com.swabhav.map.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String>();
		
		linkedhashMap.put(1, "chirag");
		linkedhashMap.put(4, "chirag");
		linkedhashMap.put(7, "raj");
		linkedhashMap.put(2, "uday");
		System.out.println(linkedhashMap);
	}
}
