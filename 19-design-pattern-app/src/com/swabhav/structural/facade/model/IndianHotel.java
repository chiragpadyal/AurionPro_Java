package com.swabhav.structural.facade.model;

public class IndianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}
	
}
