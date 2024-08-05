package com.swabhav.behavioural.state.model;

public class Packet {
	private IPacketState packetState;

	public Packet(IPacketState packetState) {
		this.packetState = packetState;
	}
	
	public IPacketState getPacketState() {
		return packetState.get();
	}

	public void next() {
		if(packetState.hasNext()) packetState = packetState.next();
	}
	
	public void previous() {
		if(packetState.hasPrevious()) packetState =packetState.previous();
	}
}
