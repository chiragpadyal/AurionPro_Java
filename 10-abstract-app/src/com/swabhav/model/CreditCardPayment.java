package com.swabhav.model;

public class CreditCardPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing credit payment");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Processing credit card refund");
		
	}
	
}
