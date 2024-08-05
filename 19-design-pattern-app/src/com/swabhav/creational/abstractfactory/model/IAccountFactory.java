package com.swabhav.creational.abstractfactory.model;

public interface IAccountFactory {
	IAccount makeAccount(String name, Long accountNumber, double totalBalance, double extraPara);
}
