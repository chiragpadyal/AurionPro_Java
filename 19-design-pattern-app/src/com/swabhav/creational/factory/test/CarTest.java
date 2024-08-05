package com.swabhav.creational.factory.test;

import com.swabhav.creational.factory.model.CarFactory;
import com.swabhav.creational.factory.model.CarType;
import com.swabhav.creational.factory.model.ICar;
import com.swabhav.creational.factory.model.Mahindra;
import com.swabhav.creational.factory.model.Maruti;
import com.swabhav.creational.factory.model.Tata;

public class CarTest {
	public static void main(String[] args) {
		ICar maruti = CarFactory.makeCar(CarType.MARUTI);
		ICar tata = CarFactory.makeCar(CarType.TATA);
		ICar mahindra = CarFactory.makeCar(CarType.MAHINDRA);
		
		
		maruti.start();
		tata.start();
		mahindra.start();
		maruti.stop();
		tata.stop();
		mahindra.stop();
	}
}
