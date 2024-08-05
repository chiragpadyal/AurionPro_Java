package com.swabhav.structural.decorator.model;

public class OilChange extends CarServiceDecorator {
	final double price = 500;

	public OilChange(ICarService obj) {
		super(obj);
	}
	

	@Override
	public double getCost() {
		return super.getCost() + price;
	}
}
