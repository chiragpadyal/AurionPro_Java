package com.swabhav.test;

public class MultiThreadedTest {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = Thread.currentThread();
		thread.setName("my thread");
		System.out.println("Name, priority , group");
		System.out.println(thread);
		
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+ " : " + i);
			Thread.sleep(1500);
		}
	}
}
