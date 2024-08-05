package com.swabhav.behavioural.state.model;

public class Delivered implements IPacketState {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public IPacketState next() {
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return true;
	}

	@Override
	public IPacketState previous() {
		return new Shift();
	}

	@Override
	public IPacketState get() {
		return this;
	}

	@Override
	public String toString() {
		return "Delivered";
	}
	
	
	
}
