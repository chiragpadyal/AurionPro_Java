package com.swabhav.map.test;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "chirag");
		treeMap.put(4, "chirag");
		treeMap.put(7, "raj");
		treeMap.put(2, "uday");
		System.out.println(treeMap);
	}
}
