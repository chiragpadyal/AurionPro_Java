package com.swabhav.model;

public class CallMe {
	public void call(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" "+message.charAt(0)+" ]");

	}
}
