package com.swabhav.behavioural.command.test;

public class Room {
	private boolean lights;

	public boolean isLights() {
		return lights;
	}

	public void turnOnLights() {
		this.lights = true;
	}

	public void turnOfLights() {
		this.lights = false;
	}

	public Room() {
		this.lights = false;
	}
	
	
}
