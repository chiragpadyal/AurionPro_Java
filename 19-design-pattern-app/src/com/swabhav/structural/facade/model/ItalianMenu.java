package com.swabhav.structural.facade.model;

public class ItalianMenu implements IMenu{

	String[] menuItems = {"Burshetta", "Caprese Salad", "Antipasto Platter", "Pasta", "Risotto", "Pizza","Cheese"};
	@Override
	public void displayMenu() {
		System.out.println("------ Italian Menu --------");
		int index = 1;
		for (String string : menuItems) {
			System.out.println(index + ") " + string);
			index++;
		}
	}


}
