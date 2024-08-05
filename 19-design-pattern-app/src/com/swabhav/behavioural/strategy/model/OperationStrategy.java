package com.swabhav.behavioural.strategy.model;

public class OperationStrategy {
	private IOperation operation;

	public OperationStrategy(IOperation operation) {
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	public int doOperation(int number1,int  number2) {
		int val = operation.doOperation(number1, number2);
		System.out.println(val); 
		return val;
	}
	
	
}
