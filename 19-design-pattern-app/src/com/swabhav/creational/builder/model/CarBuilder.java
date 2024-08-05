package com.swabhav.creational.builder.model;

public interface CarBuilder  {
	CarBuilder buildEngine(String engine);
	CarBuilder buildSeats(int seats);
	CarBuilder buildGPS(boolean isGPS);
	CarBuilder buildSunroof(boolean isSunroof);
    Car get();
}
