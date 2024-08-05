package com.swabhav.model;

/**
 * @author Chirag.Padyal
 *
 */
public class Guitar {
	private String serialNumber;
	private double price;
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWoord;
	private Wood topWood;
	
	

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWoord,
			Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWoord = backWoord;
		this.topWood = topWood;
	}



	public String getSerialNumber() {
		return serialNumber;
	}



	public double getPrice() {
		return price;
	}



	public Builder getBuilder() {
		return builder;
	}



	public String getModel() {
		return model;
	}



	public Type getType() {
		return type;
	}



	public Wood getBackWoord() {
		return backWoord;
	}



	public Wood getTopWood() {
		return topWood;
	}



	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void setBuilder(Builder builder) {
		this.builder = builder;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public void setBackWoord(Wood backWoord) {
		this.backWoord = backWoord;
	}



	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}



	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", price=" + price + ", builder=" + builder + ", model=" + model
				+ ", type=" + type + ", backWoord=" + backWoord + ", topWood=" + topWood + "]";
	}
	
	
	
}

