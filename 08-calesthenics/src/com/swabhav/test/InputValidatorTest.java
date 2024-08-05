package com.swabhav.test;

import java.util.Scanner;

import com.swabhav.model.InputValidator;

public class InputValidatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InputValidator inputValidator = new InputValidator();
		
		while(true) {				
			System.out.println("Enter Username: ");
			String username = scanner.next();
			if(inputValidator.setUsername(username)) break;
		}
		
		while(true) {
			System.out.println("Enter Password: ");
			String password = scanner.next();
			if(inputValidator.setPassword(password)) break;
		}
		
		while(true) {
			System.out.println("Enter Email: ");
			String email = scanner.next();
			if(inputValidator.setEmail(email)) break;
		}
		scanner.close();
	}
}
