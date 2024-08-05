package com.swabhav.model;

public class SavingsAccount extends Account{
	private final double MIN_BALANCE;

	public SavingsAccount(long accountNumber, String name, double balance, double MIN_BALANCE) {
		super(accountNumber, name, balance);
		this.MIN_BALANCE = MIN_BALANCE;
	}

	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	@Override
	public String toString() {
		return "SavingsAccount [MIN_BALANCE=" + MIN_BALANCE + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
	
	
	
	
	
}
