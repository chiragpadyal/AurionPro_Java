package com.swabhav.isp.voilation.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour Started Work");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour Stopped Work");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour Eat");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour Drink");
	}

}
