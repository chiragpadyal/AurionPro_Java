package com.swabhav.test;

import java.util.Scanner;

import com.swabhav.model.Account;

public class AccountTest {
	
	
	public static void main(String[] args) {
		
		Account accounts[];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of counts");
		int count = scanner.nextInt();
		accounts = new Account[count];
		for (int i = 0; i < count; i++) {
			
			accounts[i] = new Account("hari", 32);
			Account.incrementAccount();
		}
		
		System.out.println("Number Of Accounts Obj Created: " + Account.getNumberOfAccounts());
		scanner.close();
		
	}
	
}
