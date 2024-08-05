package com.techlabs.exception;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(double balance) {
		super("Balance is insufficient, Your current balance " + balance);
	}
}
