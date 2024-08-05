package com.swabhav.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.swabhav.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(new Account(1, 500, "raj"), new Account(2, 530, "rahul"),
				new Account(3, 570, "ramesh"), new Account(4, 450, "rohit"), new Account(5, 900, "rajessssh"));
		List<Account> outputAccounts;
		Optional<Account> minBalance = accounts.stream()
				.min((account1, account2) -> (int) (account1.getBalance() - account2.getBalance()));
		if(minBalance.isPresent())
		System.out.println("Min balance : " + minBalance.get().getBalance());

		Optional<Account> maxBalance = accounts.stream()
				.max((account1, account2) -> (int) (account1.getBalance() - account2.getBalance()));
		if(maxBalance.isPresent())
		System.out.println("Max balance : " + maxBalance.get().getBalance());

		outputAccounts = accounts.stream()
				.filter((account) -> account.getName().length() > 6)
				.collect(Collectors.toList());
		System.out.println("Account with name greator than 6 characters ");
		outputAccounts.stream().forEach((account) -> System.out.println(account.toString()));

		double sumOfBalance = accounts.stream()
									  .map((account) -> account.getBalance())
									  .reduce(0d,((balance1, balance2) -> balance1 + balance2));

		System.out.println("Sum of balance " + sumOfBalance);

	}

}
