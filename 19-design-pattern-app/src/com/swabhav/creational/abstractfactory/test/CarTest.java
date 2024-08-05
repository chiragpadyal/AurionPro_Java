package com.swabhav.creational.abstractfactory.test;

import com.swabhav.creational.abstractfactory.model.ICar;
import com.swabhav.creational.abstractfactory.model.MahindraFactory;
import com.swabhav.creational.abstractfactory.model.MarutiFactory;
import com.swabhav.creational.abstractfactory.model.TataFactory;

public class CarTest {
	public static void main(String[] args) {
		ICar maruti = new MarutiFactory().makeCar();
		ICar tata = new TataFactory().makeCar();
		ICar mahindra = new MahindraFactory().makeCar();
		
		
		maruti.start();
		tata.start();
		mahindra.start();
		maruti.stop();
		tata.stop();
		mahindra.stop();
	}
}
