package com.swabhav.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Inventory {
	List<Guitar> guitars;
	
	public Inventory() {
		this.guitars = new ArrayList<Guitar>();
	}

	public void addGuitar(String serialNumber,double price,Builder builder,String model,Type type,Wood backWoord,Wood topWood) {
		Guitar newGuitar = new Guitar(serialNumber, price, builder, model, type, backWoord, topWood);
		guitars.add(newGuitar);
	}
	
	public Guitar getGuitars(String serialNumber) {
		Optional<Guitar> findGuitar = this.guitars.stream().filter(guitar->guitar.getSerialNumber() == serialNumber).findFirst();
		return findGuitar.isPresent() ? findGuitar.get() : null;
	}
	
	public Guitar searchGuitar(Guitar guitarToFind) {
		Optional<Guitar> findGuitar = this.guitars.stream().filter(guitar->{
		    if (guitarToFind.getType() != null && !guitarToFind.getType().equals(guitar.getType())) return false;
		    if (guitarToFind.getSerialNumber() != null && !guitarToFind.getSerialNumber().equals(guitar.getSerialNumber())) return false;
		    if (guitarToFind.getTopWood() != null && !guitarToFind.getTopWood().equals(guitar.getTopWood())) return false;
		    if (guitarToFind.getBackWoord() != null && !guitarToFind.getBackWoord().equals(guitar.getBackWoord())) return false;
		    if (guitarToFind.getPrice() != guitar.getPrice()) return false;
		    if (guitarToFind.getModel() != null && !guitarToFind.getModel().equals(guitar.getModel())) return false;
		    if (guitarToFind.getBuilder() != null && !guitarToFind.getBuilder().equals(guitar.getBuilder())) return false;
		    return true;
		}).findFirst();
		return findGuitar.isPresent() ? findGuitar.get() : null;
	}
		
}
