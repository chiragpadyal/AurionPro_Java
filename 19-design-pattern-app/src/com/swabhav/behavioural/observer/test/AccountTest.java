package com.swabhav.behavioural.observer.test;

import java.util.Observable;

import com.swabhav.behavioural.observer.model.Account;
import com.swabhav.behavioural.observer.model.EmailNotifier;
import com.swabhav.behavioural.observer.model.SmsNotifier;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(666666666, "om", 400);
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		
		acc1.credit(400);
		acc1.debit(400);
	}
}
