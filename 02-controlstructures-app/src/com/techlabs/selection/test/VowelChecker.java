package com.techlabs.selection.test;

import java.util.*;

public class VowelChecker {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a character: ");
	char letter = scanner.next().charAt(0);
	
	switch (letter) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("Is Vowel");
		break;
	default:
		System.out.println("Not a Vowel");
		break;
	}
	scanner.close();
}
}
