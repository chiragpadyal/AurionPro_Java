package com.swabhav.isp.fixed.model;

public class Labour implements ILabour{

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
