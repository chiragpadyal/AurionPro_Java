package com.swabhav.behavioural.state.model;

public class Shift implements IPacketState {

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public IPacketState next() {
		return new Delivered();
	}

	@Override
	public boolean hasPrevious() {
		return true;
	}

	@Override
	public IPacketState previous() {
		return new Ordered();
	}

	@Override
	public IPacketState get() {
		return this;
	}

	@Override
	public String toString() {
		return "Shift";
	}
	
	
	
}
