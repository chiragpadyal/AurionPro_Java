package com.swabhav.behavioural.command.test;

public class SwitchLightsCommand implements Command{
	
	private Room room;
	
	public SwitchLightsCommand(Room room) {
		this.room = room;
	}

	public void execute() {
		room.turnOnLights();
	}
}
