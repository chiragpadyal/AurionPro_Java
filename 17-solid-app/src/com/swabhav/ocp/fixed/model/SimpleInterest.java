package com.swabhav.ocp.fixed.model;

import com.swabhav.ocp.fixed.model.interfaces.IFestivalInterest;

public class SimpleInterest {
	
	private IFestivalInterest festivalInterest;
	private FixedDeposite fixedDeposite;
	

	public SimpleInterest(IFestivalInterest festivalInterest, FixedDeposite fixedDeposite) {
		this.festivalInterest = festivalInterest;
		this.fixedDeposite = fixedDeposite;
	}

	public double calculateSimpleInterest() {
		return (fixedDeposite.getPrincipal() * fixedDeposite.getDuration() * festivalInterest.getInterestRate())  / 100;
	}
}
