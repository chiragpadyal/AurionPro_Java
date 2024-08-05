package com.swabhav.creational.abstractfactory.model;

public  class CurrentFactory implements IAccountFactory{

	@Override
	public IAccount makeAccount(String name, Long accountNumber, double totalBalance, double overdraftlimit) {
		return new Current(accountNumber, name, totalBalance);
	}
	
}
