package com.swabhav.structural.adapter.model;

public class HatAdapter implements IItem{

	private Hat hat;
	
	
	public HatAdapter(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getShortName() + " " + hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBasicPrice() + hat.getTax();
	}
	
}
