package com.swabhav.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class CompositeParts implements IPart {
	private List<IPart> partsList;
	private String name;
	private double price;
	
	
	
	public CompositeParts(String name, double price) {
		partsList = new ArrayList<IPart>();
		this.name = name;
		this.price = price;
	}
	public List<IPart> getPartsList() {
		return partsList;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPartsList(List<IPart> partsList) {
		this.partsList = partsList;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addItem(IPart part) {
		partsList.add(part);
	}
	@Override
	public void display() {
	        System.out.println("Task List: " + name);
	        for (IPart part : partsList) {
	        	part.display();
	        }
	    }

}
