package com.swabhav.creational.abstractfactory.model;

public  class SavingFactory implements IAccountFactory{

	@Override
	public IAccount makeAccount(String name, Long accountNumber, double totalBalance, double minimumBalance) {
		return new Saving(accountNumber, name, totalBalance);
	}
	
}
