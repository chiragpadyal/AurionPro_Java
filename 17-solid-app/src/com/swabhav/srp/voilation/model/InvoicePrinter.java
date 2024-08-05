package com.swabhav.srp.voilation.model;

public class InvoicePrinter {

	private Invoice invoice;
	private TaxCalculator taxCalculator;
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}

	public void printInvoice() {
		System.out.println( "Invoice details: \n id=" + invoice.getId() + ", \n description=" + invoice.getDescription() + ", \n amount=" + invoice.getAmount() + ", \n tax=" + invoice.getTax()+ " \n total amount = " + (invoice.getAmount() + taxCalculator.calculateTax())
		);
	}
}
