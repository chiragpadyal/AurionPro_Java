package com.swabhav.model;

public class Operators {
	
	void shortCircuitOperators(boolean a, boolean b ) {
		if (a & b) {
			System.out.println("Checked both conditons");
		}
		
		if (a && b) {
			System.out.println("Checked only first operator");
		}
	}
	
	int bitwiseOperator(int number1, int number2){
		return number1 & number2;
	}
	
	public static void main(String[] args) {
	
		Operators ops = new Operators();
		ops.shortCircuitOperators(true, false);
	}
}
