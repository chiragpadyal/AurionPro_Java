package com.swabhav.structural.adapter.model;

public class Hat {
	private String shortName;
	private String longName;
	private double basicPrice;
	private double tax;
	public Hat(String shortName, String longName, double basicPrice, double tax) {
		this.shortName = shortName;
		this.longName = longName;
		this.basicPrice = basicPrice;
		this.tax = tax;
	}
	public String getShortName() {
		return shortName;
	}
	public String getLongName() {
		return longName;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public double getTax() {
		return tax;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
}
