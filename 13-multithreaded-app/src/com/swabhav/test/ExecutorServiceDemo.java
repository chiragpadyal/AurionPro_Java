package com.swabhav.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.swabhav.model.Task;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processor: " + coreCount);
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		for (int i = 0; i < 1000; i++) {
			service.execute(new Task());
		}
		
		
	}
}
