package com.swabhav.dip.fixed.model;

public class TaxCalculator {

	public TaxCalculator() {
		
	}
	
	public int calculateTax(int amount, int rate) {
		int tax =0;
		try {
			tax = amount/rate;
			System.out.println("Tax is : " + tax);
		} catch (Exception e) {
			new DBLogger().log("database / by zero");
			new FileLogger().log("database / by zero");
			new NetworkLogger().log("database / by zero");
		}
		return tax;
	}
}
