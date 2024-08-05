package com.swabhav.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private long accno;
	private String name;
	private double balance;
	private List<INotifier> listOfNotification;
	
	public long getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.listOfNotification = new ArrayList<INotifier>();
	}
	
	
	public void credit(double amount) {
		if(amount < 0) return;
		balance += amount;
		this.sendNotification("Credited by " + amount);
	}
	
	public void debit(double amount) {
		if(amount < 0) return;
		if(balance < amount) return;
		balance -= amount;
		this.sendNotification("Debitted by " + amount);
	}
	
	
	public void addNotifier(INotifier notify) {
		listOfNotification.add(notify);
	}
	
	public void sendNotification(String message) {
		for (INotifier iNotifier : listOfNotification) {
			iNotifier.notifyApp(this, message);
		}
	}
	
}
