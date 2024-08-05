package com.swabhav.test;

import com.swabhav.model.Payment;
import com.swabhav.model.CreditCardPayment;
import com.swabhav.model.BankTransferPayment;
import com.swabhav.model.PayPalPayment;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payPalPayment;
		Payment bankTransferPayment;
		Payment creditCardPayment;
		
		payPalPayment = new PayPalPayment();
		payPalPayment.refund();
		payPalPayment.processPayment();
		
		bankTransferPayment = new BankTransferPayment();
		bankTransferPayment.refund();
		bankTransferPayment.processPayment();
		
		creditCardPayment = new CreditCardPayment();
		creditCardPayment.refund();
		creditCardPayment.processPayment();

	}
}
