package com.swabhav.model;

public class BankTransferPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("Processing Bank transfer payment");
	}

	@Override
	public void refund() {
		System.out.println("Processing bank transfer refund");
		
	}
	
}
