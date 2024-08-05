package com.swabhav.structural.facade.model;

public class SoundSystem implements ISoundSystem {
	public void on() {
		System.out.println("Sound System status ON");
	}
	
	public void setVolume(int volumeLevel) {
		System.out.println("Volume set to: " + volumeLevel);
	}
}
