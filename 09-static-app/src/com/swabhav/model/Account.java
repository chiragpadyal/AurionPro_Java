package com.swabhav.model;

public class Account {
	private String name;
	private int balance;
	private static int numberOfAccounts = 0;
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	};
	
	public static void incrementAccount() {
		numberOfAccounts++;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
}

