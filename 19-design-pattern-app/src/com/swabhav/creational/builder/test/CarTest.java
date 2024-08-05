package com.swabhav.creational.builder.test;

import com.swabhav.creational.builder.model.Car;
import com.swabhav.creational.builder.model.ConcreteCarBuilder;

public class CarTest {
    public static void main(String[] args) {
        // Using ConcreteCarBuilder
        Car car1 = new ConcreteCarBuilder().buildEngine("alpha").buildGPS(true).buildSeats(4).buildSunroof(false).get();
        Car car2 = new ConcreteCarBuilder().buildEngine("beta").buildGPS(false).buildSeats(2).buildSunroof(false).get();
        
        System.out.println(car1);
        System.out.println(car2);
    }
}
