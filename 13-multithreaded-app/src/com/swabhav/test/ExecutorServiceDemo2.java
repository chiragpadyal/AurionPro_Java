package com.swabhav.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.swabhav.model.NewTask;
import com.swabhav.model.Task;

public class ExecutorServiceDemo2 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<Integer> futureInt = service.submit(new NewTask());
		
		List<NewTask> tasks = new ArrayList<NewTask>();
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		try {
			
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for (Future<Integer> future : futures) {
				System.out.println(future.get());
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
