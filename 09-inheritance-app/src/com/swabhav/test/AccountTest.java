package com.swabhav.test;

import java.util.Scanner;

import com.swabhav.model.Account;
import com.swabhav.model.CurrentAccount;
import com.swabhav.model.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter account number: ");
		long accountNumber = scanner.nextLong();
		System.out.println("enter account name: ");
		String name = scanner.next();
		System.out.println("enter account balance: ");
		double balance = scanner.nextDouble();
		System.out.println("enter MIN_BALANCE: ");
		double MIN_BALANCE = scanner.nextDouble();
		System.out.println("enter OVER_DRAFT_LIMIT: ");
		double OVER_DRAFT_LIMIT = scanner.nextDouble();
		Account savingAcc = new SavingsAccount(accountNumber, name, balance, MIN_BALANCE);
		System.out.println(savingAcc);
		
		Account currentAcc = new CurrentAccount(accountNumber, name, balance, OVER_DRAFT_LIMIT);
		System.out.println(currentAcc);
		
		scanner.close();
	}
}
