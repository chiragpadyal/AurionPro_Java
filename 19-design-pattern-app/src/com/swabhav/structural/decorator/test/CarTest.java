package com.swabhav.structural.decorator.test;

import com.swabhav.structural.decorator.model.CarInspection;
import com.swabhav.structural.decorator.model.ICarService;
import com.swabhav.structural.decorator.model.OilChange;

public class CarTest {
	public static void main(String[] args) {
		// oil and inspec
		ICarService carInspec = new CarInspection();
		ICarService oilChange = new OilChange(carInspec);
		System.out.println(oilChange.getCost());
		
	}
}
