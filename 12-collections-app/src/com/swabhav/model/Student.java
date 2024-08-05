package com.swabhav.model;

public class Student {
	private int rollno;
	private String name;
	private double percentage;
	
	
	
	public Student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
}
