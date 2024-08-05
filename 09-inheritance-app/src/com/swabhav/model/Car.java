package com.swabhav.model;

public class Car extends FourWheeler{
	private double price;

	public Car(String companyname, double mileage, double price) {
		super(companyname, mileage);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [Price=" + getPrice() + ", Mileage=" + getMileage()
				+ ", Companyname=" + getCompanyname() + "]";
	}
	
	
	
}
