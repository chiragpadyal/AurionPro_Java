package com.swabhav.structural.adapter.model;

public class Biscuit implements IItem{
	private String name;
	private double price;

	
	
	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public double getItemPrice() {
		return this.price;
	}

}
