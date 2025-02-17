package com.swabhav.creational.abstractfactory.model;

public class Current implements IAccount{
	private double totalBalance;
	private String name;
	private Long accountNumber;
	private double minbalance;
	
	
	public Current(Long accountNumber, String name, double totalBalance) {
		this.totalBalance = totalBalance;
		this.name = name;
		this.accountNumber = accountNumber;
	}

	@Override
	public void credit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
			this.totalBalance+= amount;
			System.out.println("Amount Credited");
			return;
		}
		System.out.println("Amount not credited");
		
	}

	@Override
	public void debit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0 && this.totalBalance >= amount) {
			this.totalBalance-= amount;
			System.out.println("Amount Debited");
			return;
		}
		System.out.println("Amount not debited");
		
	}

	@Override
	public String toString() {
		return "Current [totalBalance=" + totalBalance + "]";
	}
	
	public String getName() {
		return name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	

	
}
