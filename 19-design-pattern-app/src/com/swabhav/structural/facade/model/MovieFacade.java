package com.swabhav.structural.facade.model;

public class MovieFacade {
	public void watchMovie() {
		IDvdPlayer dvd = new DvdPlayer();
		ISoundSystem soundSys = new SoundSystem();
		IProjector projector = new Projector();
		
		dvd.on();
		dvd.setMovie("Tere Naam");
		soundSys.on();
		soundSys.setVolume(3);
		projector.on();
	}
}
