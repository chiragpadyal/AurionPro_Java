package com.swabhav.structural.facade.model;

public class DvdPlayer implements IDvdPlayer {
	public void on() {
		System.out.println("Dvd Player status ON");
	}
	
	public void setMovie(String movie) {
		System.out.println("Movie Playing: " + movie);
	}
}
