package com.swabhav.dip.voilation.test;

import com.swabhav.dip.voilation.model.DBLogger;
import com.swabhav.dip.voilation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		DBLogger dblogger = new DBLogger();
		TaxCalculator t1 = new TaxCalculator(dblogger);
		t1.calculateTax(100, 10);
		
		TaxCalculator t2 = new TaxCalculator(dblogger);
		t2.calculateTax(2000, 0);
	}
}
