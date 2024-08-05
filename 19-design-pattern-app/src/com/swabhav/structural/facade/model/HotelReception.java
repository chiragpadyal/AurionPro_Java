package com.swabhav.structural.facade.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		indHotel.getMenu().displayMenu();
	}
	public void getItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		italianHotel.getMenu().displayMenu();
	}
}
