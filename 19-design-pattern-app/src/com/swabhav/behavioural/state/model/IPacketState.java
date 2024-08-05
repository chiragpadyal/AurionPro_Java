package com.swabhav.behavioural.state.model;

import java.util.Iterator;

public interface IPacketState extends Iterator<IPacketState> {
	boolean hasPrevious();
	IPacketState previous();
	IPacketState get();
}
