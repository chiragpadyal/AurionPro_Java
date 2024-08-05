package com.swabhav.creational.abstractfactory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return new Mahindra();
		
	}
}
