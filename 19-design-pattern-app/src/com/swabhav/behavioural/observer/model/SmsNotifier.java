package com.swabhav.behavioural.observer.model;

public class SmsNotifier implements INotifier{

	@Override
	public void notifyApp(Account acc, String message) {
		String accNumber = new Long(acc.getAccno()).toString();
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < accNumber.length() - 4; i++) {
			strBuild.append("x");
		} 
		
		String hiddenAccNumber = strBuild + accNumber.substring((accNumber.length() - 4));
		System.out.println("-----------SMS-----------");
		System.out.println("Hi, " + acc.getName());
		System.out.println("Apka Account Number " + hiddenAccNumber);
		System.out.println("Has been " + message);
		System.out.println("Your Current Balance: " + acc.getBalance());
	}

}
