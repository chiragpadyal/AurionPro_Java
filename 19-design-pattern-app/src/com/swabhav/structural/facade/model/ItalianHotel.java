package com.swabhav.structural.facade.model;

public class ItalianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		return new IndianMenu();
	}
	
}
