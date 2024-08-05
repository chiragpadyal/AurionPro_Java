package com.swabhav.structural.decorator.model;

public class WheelAlign extends CarServiceDecorator{
	final double price = 300;
	public WheelAlign(ICarService obj) {
		super(obj);
	}

	@Override
	public double getCost() {
		return super.getCost() + price;
	}
}
