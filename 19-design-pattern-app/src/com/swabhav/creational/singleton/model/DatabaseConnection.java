package com.swabhav.creational.singleton.model;

public class DatabaseConnection {
	private static DatabaseConnection db;
	private DatabaseConnection() {
		System.out.println("Connected Successfully");
	}
	
	
	public static DatabaseConnection init() {
		if(db == null) db = new DatabaseConnection();
		return db;
	}
	
	public void check() {
		System.out.println("is Connected");
	}
}
