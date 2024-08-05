package com.swabhav.dip.fixed.model;

public class FileLogger implements Logger{
	@Override
	public void log(String err) {
		System.out.println("Logged to File " + err);
	}
}
