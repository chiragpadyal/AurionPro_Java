package com.swabhav.model;

import java.util.Random;
import java.util.concurrent.Callable;

public class NewTask implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		Random rand = new Random();
		return rand.nextInt(1000);
	}
}
