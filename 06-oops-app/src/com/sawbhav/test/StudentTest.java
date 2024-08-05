package com.sawbhav.test;

import java.util.Scanner;

import com.sawbhav.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter student name: ");
		String name = (scanner.next());
		System.out.println("Enter student age: ");
		int age = scanner.nextInt();
		System.out.println("Enter student percentage: ");
		double percentage = (scanner.nextInt());
		System.out.println("Enter student roll no: ");
		int rollno =  scanner.nextInt();
		
		Student student1 = new Student(rollno, age, name, percentage);
		student1.display();
		
		
		Student student2 = new Student();
		
		System.out.println("Enter student name: ");
		student2.setName(scanner.next());
		System.out.println("Enter student age: ");
		student2.setAge(scanner.nextInt());
		System.out.println("Enter student percentage: ");
		student2.setPercentage(scanner.nextDouble());
		System.out.println("Enter student roll no: ");
		student2.setRollno(scanner.nextInt());
		student2.display();
		
		scanner.close();
		
		
		
		
	}
}
