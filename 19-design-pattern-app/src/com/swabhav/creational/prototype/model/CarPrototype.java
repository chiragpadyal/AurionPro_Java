package com.swabhav.creational.prototype.model;

public interface CarPrototype extends Cloneable{
	CarPrototype clone();
	void make();
	String getName();
	void setName(String name);
}
