package com.swabhav.srp.voilation.model;

public class TaxCalculator {
	private Invoice invoice;

	public TaxCalculator(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public double calculateTax() {
		double taxCal = invoice.getAmount() * invoice.getTax() / 100;
		return taxCal;
	}
	
	
}
