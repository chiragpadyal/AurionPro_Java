package com.swabhav.dip.fixed.model;

public class NetworkLogger implements Logger{
	@Override
	public void log(String err) {
		System.out.println("Logged to Network " + err);
	}
}
