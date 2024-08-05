package com.swabhav.structural.decorator.model;

public class CarInspection implements ICarService{
	final double price = 1000;

	@Override
	public double getCost() {
		return price;
	}
	
	
	
}
