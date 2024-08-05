package com.swabhav.behavioural.strategy.test;

import com.swabhav.behavioural.strategy.model.Addition;
import com.swabhav.behavioural.strategy.model.Division;
import com.swabhav.behavioural.strategy.model.IOperation;
import com.swabhav.behavioural.strategy.model.Multiplication;
import com.swabhav.behavioural.strategy.model.OperationStrategy;
import com.swabhav.behavioural.strategy.model.Subtraction;

public class OperationTest {
	public static void main(String[] args) {
		IOperation currentOperation = new Addition();
		OperationStrategy opsStrats = new OperationStrategy(currentOperation);
		
		System.out.println("Addition");
		opsStrats.doOperation(5, 6);
		System.out.println("Multiplication");
		opsStrats.setOperation(new Multiplication());
		opsStrats.doOperation(5, 6);
		System.out.println("Subtraction");
		opsStrats.setOperation(new Subtraction());
		opsStrats.doOperation(5, 6);
		System.out.println("Division");
		opsStrats.setOperation(new Division());
		opsStrats.doOperation(5, 6);
	}
}
