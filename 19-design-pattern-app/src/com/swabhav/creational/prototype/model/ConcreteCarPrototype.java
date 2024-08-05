package com.swabhav.creational.prototype.model;

public class ConcreteCarPrototype implements CarPrototype {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public CarPrototype clone() {
        return new ConcreteCarPrototype();
	}

	@Override
	public void make() {
		System.out.println("Made Car");
	}

}
