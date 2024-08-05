package com.swabhav.creational.builder.model;
public class Car {
    private String engine;
    private int seats;
    private boolean isGPS;
    private boolean isSunroof;

    // Setters for private fields
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setGPS(boolean isGPS) {
        this.isGPS = isGPS;
    }

    public void setSunroof(boolean isSunroof) {
        this.isSunroof = isSunroof;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", seats=" + seats + ", GPS=" + isGPS + ", Sunroof=" + isSunroof + "]";
    }
}
