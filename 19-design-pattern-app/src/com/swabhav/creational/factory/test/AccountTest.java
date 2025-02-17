package com.swabhav.creational.factory.test;

import com.swabhav.creational.factory.model.AccountFactory;
import com.swabhav.creational.factory.model.AccountType;
import com.swabhav.creational.factory.model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		IAccount currentAccount = AccountFactory.makeAccount(AccountType.CURRENT).create("John", 54468l, 180d, 180d);
		IAccount savingAccount = AccountFactory.makeAccount(AccountType.SAVING).create("John", 54468l, 180d, 180d);
		
		System.out.println("Credit 500");
		currentAccount.credit(500);
		System.out.println("Debit 250");
		currentAccount.debit(250);
		System.out.println("Debit 1000");
		currentAccount.debit(1000);
		System.out.println("Balance" + currentAccount);
		
		
		System.out.println("Credit 500");
		savingAccount.credit(500);
		System.out.println("Debit 250");
		savingAccount.debit(250);
		System.out.println("Debit 1000");
		savingAccount.debit(1000);
		System.out.println("Balance" + savingAccount);
	}
}
