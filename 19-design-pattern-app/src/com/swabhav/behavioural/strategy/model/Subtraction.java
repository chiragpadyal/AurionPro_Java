package com.swabhav.behavioural.strategy.model;

public class Subtraction implements IOperation{

	@Override
	public int doOperation(int number1, int number2) {
		return number1 - number2;
	}
	
}
