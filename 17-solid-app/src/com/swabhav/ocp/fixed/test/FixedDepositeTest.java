package com.swabhav.ocp.fixed.test;

import com.swabhav.ocp.fixed.model.interfaces.DiwaliInterest;
import com.swabhav.ocp.fixed.model.interfaces.NewYearInterest;
import com.swabhav.ocp.fixed.model.FixedDeposite;
import com.swabhav.ocp.fixed.model.SimpleInterest;

public class FixedDepositeTest {
	public static void main(String[] args) {
		FixedDeposite fixedDeposite = new FixedDeposite(5, "raj", 4500, 3);
		SimpleInterest simpleInterest = new SimpleInterest(new DiwaliInterest(), fixedDeposite);
		SimpleInterest simpleInterest2 = new SimpleInterest(new NewYearInterest() , fixedDeposite);
		System.out.println("Simple interest Diwali is : " + simpleInterest.calculateSimpleInterest());
		System.out.println("Simple interest New Year is : " + simpleInterest2.calculateSimpleInterest());
	}
}
