package com.sawbhav.model;

public class Student {
	private int rollno;
	private int age;
	private double percentage;
	private String name;
	
	public Student() {
		rollno = 5;
		age = 18;
		name = "hari";
		percentage = 32;
	}
	
	public Student(int rollno, int age, String name, double percentage) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.percentage = percentage;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		if(rollno <= 0) {
			System.out.println("Roll No must be non negative!");
			return;
		}
		this.rollno = rollno;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("Age must be above 1!");
			return;
		}
		this.age = age;
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		if(percentage >= 100 || percentage < 0) {
			System.out.println("Percentage must be between 0 to 100!");
			return;
		}
		this.percentage = percentage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.isEmpty()) {
			System.out.println("Name should not be empty!");
			return;
		}
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name : " + this.getName());
		System.out.println("Age : " + this.getAge());
		System.out.println("Roll No : " + this.getRollno());
		System.out.println("Percentage : " + this.getPercentage());
	}
	
}
