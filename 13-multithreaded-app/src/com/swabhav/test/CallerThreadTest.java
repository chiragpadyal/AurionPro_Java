package com.swabhav.test;

import com.swabhav.model.CallMe;
import com.swabhav.model.CallerThread;

public class CallerThreadTest {
	public static void main(String[] args) {
		CallMe target = new CallMe();
		CallerThread thread1 = new CallerThread("Hello", target);
		CallerThread thread2 = new CallerThread("Swabhav", target);
		CallerThread thread3 = new CallerThread("Techlabs", target);

		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}	
}
