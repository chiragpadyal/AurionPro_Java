package com.swabhav.model;

public class CallerThread implements Runnable{

	private String message;
	private CallMe target;
	private Thread thread;

	public CallerThread(String message, CallMe target) {
		super();
		this.message = message;
		this.target = target;
		this.thread = new Thread(this);
		this.thread.start();
	}
	
	@Override
	public void run() {
		synchronized (target) {
			target.call(message);
		}
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
