package com.swabhav.structural.facade.test;

import com.swabhav.structural.facade.model.HotelReception;

public class HotelTest {
	public static void main(String[] args) {
		HotelReception reception = new HotelReception();
		reception.getIndianMenu();
		reception.getItalianMenu();
	}
}
