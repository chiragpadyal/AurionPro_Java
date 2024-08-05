package com.swabhav.map.test;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "chirag");
		hashMap.put(4, "chirag");
		hashMap.put(7, "raj");
		hashMap.put(2, "uday");
		System.out.println(hashMap);
		
	}
}
