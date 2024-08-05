package com.swabhav.dip.fixed.model;

public class DBLogger implements Logger{
	@Override
	public void log(String err) {
		System.out.println("Logged to database " + err);
	}
}
