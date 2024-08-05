package com.swabhav.creational.abstractfactory.model;

public interface IAccount {
	void credit(double amount);
	void debit(double amount);
	String toString();
	String getName();
	void setName(String name);
	Long getAccountNumber();
	void setAccountNumber(Long accountNumber);
	double getTotalBalance();
	void setTotalBalance(double totalBalance);
	
	
}
