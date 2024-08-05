package com.swabhav.creational.singleton.test;

import com.swabhav.creational.singleton.model.DatabaseConnection;

public class DatabaseTest {
	public static void main(String[] args) {
		DatabaseConnection db = DatabaseConnection.init();
		db.check();
		
		DatabaseConnection db2 = DatabaseConnection.init();
		db2.check();
	}
}
