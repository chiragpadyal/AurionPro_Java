package com.swabhav.creational.singleton.test;

import com.swabhav.creational.singleton.model.Login;

public class LoginTest {
	public static void main(String[] args) {
		Login login1 = Login.initialiaze();
		login1.status();
		System.out.println(login1.hashCode());
		
		Login login2 = Login.initialiaze();
		login2.status();
		System.out.println(login2.hashCode());
	}
}
