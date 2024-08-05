package com.swabhav.map.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterationtest {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "chirag");
		hashMap.put(4, "chirag");
		hashMap.put(7, "raj");
		hashMap.put(2, "uday");

		Set<Entry<Integer, String>> entries =  hashMap.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() +  " - " + entry.getValue());
		}
		
		
		
	}
}
