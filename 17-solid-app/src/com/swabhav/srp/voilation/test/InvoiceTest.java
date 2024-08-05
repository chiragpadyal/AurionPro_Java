	package com.swabhav.srp.voilation.test;

import com.swabhav.srp.voilation.model.Invoice;
import com.swabhav.srp.voilation.model.InvoicePrinter;
import com.swabhav.srp.voilation.model.TaxCalculator;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice("4", "description is this! ", 1000, 10);
		TaxCalculator taxCalculator = new TaxCalculator(invoice);
		InvoicePrinter invoicPrinter = new InvoicePrinter(invoice, taxCalculator);
		invoicPrinter.printInvoice();
	}
}
