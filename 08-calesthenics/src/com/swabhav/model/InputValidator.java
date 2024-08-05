package com.swabhav.model;

public class InputValidator {
	private String username;
	private String password;
	private String 	email;
	
	
	private boolean isNullAndEmpty(String text) {
		if(username.isEmpty() || username == null) {
			System.out.println("Empty Input!");
			return true;
		}
		return false;
	}
	
	private boolean isStringInRange(String text, int min, int max) {
		if(text.length() < min || text.length() > max) {
			System.out.println("Input must be between "+ min +" to "+ max +" characters only!");
			return true;
		}
		return false;
	}
	
	private boolean doesStringContains(String text, String toFind) {
		if(!email.contains(toFind)) {
			System.out.println("Input must contain "+ toFind + "!");
			return true; 
		}
		return false;
	}
	
	public String getUsername() {
		return username;
	}
	public boolean setUsername(String username) {
		if(this.isNullAndEmpty(username)) return false;
		if(this.isStringInRange(username, 3, 20)) return false;
		this.username = username;
		return true;
	}
	public String getPassword() {
		return password;
	}
	
	public boolean setPassword(String password) {
		if(this.isNullAndEmpty(password)) return false;
		if(this.isStringInRange(password, 8, 30)) return false;
		this.password = password;
		return true;
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(this.isNullAndEmpty(email)) return false;
		if(this.isStringInRange(email, 5, 50)) return false;
		if(this.doesStringContains(email, "@")) return false;
		if(this.doesStringContains(email, ".")) return false;
		this.email = email;
		return true;
	}
	
	
	
}
