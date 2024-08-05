package com.swabhav.creational.factory.model;

public class CarFactory {
	public static ICar makeCar (CarType carType) {
		switch (carType) {
		case MAHINDRA:
			return new Mahindra();
		case MARUTI:
			return new Maruti();
		case TATA:
			return new Tata();
		default:
			return null;
		}
	}
}
