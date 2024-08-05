package com.swabhav.ocp.voilation.test;

import com.swabhav.ocp.voilation.model.FestivalType;
import com.swabhav.ocp.voilation.model.FixedDeposite;

public class FixedDepositeTest {
	public static void main(String[] args) {
		FixedDeposite fixedDeposite = new FixedDeposite(5, "raj", 45, 3, FestivalType.HOLI);
		double simpleInterest = fixedDeposite.calculateSimpleInterest();
		System.out.println("Simple interest is : " + simpleInterest);
		
	}
}
