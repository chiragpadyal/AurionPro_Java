package com.swabhav.creational.builder.model;

public class ConcreteCarBuilder implements CarBuilder {
    private Car car;

    public ConcreteCarBuilder() {
        this.car = new Car();
    }

    @Override
    public CarBuilder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder buildSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public CarBuilder buildGPS(boolean isGPS) {
        car.setGPS(isGPS);
        return this;
    }

    @Override
    public CarBuilder buildSunroof(boolean isSunroof) {
        car.setSunroof(isSunroof);
        return this;
    }

    @Override
    public Car get() {
        return car;
    }
}
