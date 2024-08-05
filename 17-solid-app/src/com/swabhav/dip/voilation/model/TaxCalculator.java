package com.swabhav.dip.voilation.model;

public class TaxCalculator {
	private DBLogger dblogger;

	public TaxCalculator(DBLogger dblogger) {
		super();
		this.dblogger = dblogger;
	}
	
	public int calculateTax(int amount, int rate) {
		int tax =0;
		try {
			tax = amount/rate;
			System.out.println("Tax is : " + tax);
		} catch (Exception e) {
			dblogger.log(e.getMessage());
		}
		return tax;
	}
}
