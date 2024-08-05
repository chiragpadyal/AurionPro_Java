package com.swabhav.creational.prototype.test;

import com.swabhav.creational.prototype.model.CarPrototype;
import com.swabhav.creational.prototype.model.ConcreteCarPrototype;

public class CarTest {
	public static void main(String[] args) {
		CarPrototype car1 = new ConcreteCarPrototype();
		car1.setName("Maruti");
		CarPrototype car1Clone = car1.clone();
		car1Clone.setName("Mahindra");
		
        System.out.println("Original: " + car1.getName());
        System.out.println("Cloned: " + car1Clone.getName());
	}
}
