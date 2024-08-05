package com.swabhav.ocp.fixed.model;

import com.swabhav.ocp.fixed.model.interfaces.IFestivalInterest;
import com.swabhav.ocp.voilation.model.FestivalType;

public class FixedDeposite {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	public FixedDeposite(int accountNumber, String name, double principal, int duration) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestival() {
		return festival;
	}
	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	
	
}
