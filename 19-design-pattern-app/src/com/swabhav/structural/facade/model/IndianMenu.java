package com.swabhav.structural.facade.model;

public class IndianMenu implements IMenu{

	String[] menuItems = {"Samosa", "Vada pav", "Roti", "Biryani", "Lassi", "Apple Juice"};
	@Override
	public void displayMenu() {
		System.out.println("------ Indian Menu --------");
		int index = 1;
		for (String string : menuItems) {
			System.out.println(index + ") " + string);
			index++;
		}
	}

}
