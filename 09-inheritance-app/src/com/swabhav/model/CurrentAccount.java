package com.swabhav.model;

public class CurrentAccount extends Account{
	private final double OVER_DRAFT_LIMIT;

	public CurrentAccount(long accountNumber, String name, double balance, double OVER_DRAFT_LIMIT) {
		super(accountNumber, name, balance);
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
	}

	public double getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}

	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	} 
	
	
}
