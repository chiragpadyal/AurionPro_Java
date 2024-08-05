package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exception.AgeNotFoundException;
import com.techlabs.model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		Voter voter;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter id ");
			int voterId = scanner.nextInt();
			System.out.println("Enter firstname ");
			String firstName = scanner.next();
			System.out.println("Enter lastname ");
			String lastName = scanner.next();
			System.out.println("Enter age ");
			int age = scanner.nextInt();
			
			voter = new Voter(voterId, firstName, lastName, age);
			System.out.println(voter);
		} catch (AgeNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			scanner.close();
		}
}
}
