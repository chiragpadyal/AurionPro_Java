package com.swabhav.model;

public class FourWheeler extends Vehicle{
	private double mileage;

	public FourWheeler(String companyname, double mileage) {
		super(companyname);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
}
