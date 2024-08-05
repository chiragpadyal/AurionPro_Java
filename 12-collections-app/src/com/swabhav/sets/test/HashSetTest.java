package com.swabhav.sets.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Mandar");
		hashSet.add("Chirag");
		hashSet.add("Chirag");
		hashSet.add("chirag");
		hashSet.add("raj");
		hashSet.add("swabhav");
		
		System.out.println("Hash set (sort by hash) : ");
		System.out.println(hashSet);
		
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Mandar");
		linkedHashSet.add("Chirag");
		linkedHashSet.add("Chirag");
		linkedHashSet.add("chirag");
		linkedHashSet.add("raj");
		linkedHashSet.add("swabhav");
		
		System.out.println("Linked Hash Set: (sort by insertion) ");
		System.out.println(linkedHashSet);
		
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Mandar");
		treeSet.add("Chirag");
		treeSet.add("Chirag");
		treeSet.add("chirag");
		treeSet.add("raj");
		treeSet.add("swabhav");
		
		System.out.println("Tree Set (sorted by ascii) :");
		System.out.println(treeSet);
		
		
		
	}
}
