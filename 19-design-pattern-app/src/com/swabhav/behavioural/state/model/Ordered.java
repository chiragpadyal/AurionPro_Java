package com.swabhav.behavioural.state.model;

public class Ordered implements IPacketState {

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public IPacketState next() {
		return new Shift();
	}

	@Override
	public boolean hasPrevious() {
		return false;
	}

	@Override
	public IPacketState previous() {
		return null;
	}

	@Override
	public IPacketState get() {
		return this;
	}

	@Override
	public String toString() {
		return "Ordered";
	}
	
	
	
}
