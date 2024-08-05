package com.swabhav.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.swabhav.model.Student;
import com.swabhav.model.StudentComparator;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		addStudents(scanner, students);
		System.out.println("------------ UnSorted List ------------");
		showStudents(students);
		
		System.out.println("------------ Sorted List By Name ------------");
		sortByName(students);
		showStudents(students);
		
		System.out.println("------------ Sorted List By RollNo ------------");
		sortByRollNumber(students);
		showStudents(students);
		
		System.out.println("------------ Sorted List By Percentage ------------");
		sortByPercentage(students);
		showStudents(students);
	}
	
	
	private static void addStudents(Scanner scanner, List<Student> students) {
		System.out.println("Enter number Of students to create");
		int numberOfStudents = scanner.nextInt();
		for (int i = 1; i <= numberOfStudents; i++) {
			System.out.println("-----------------------------------");
			System.out.println("Enter student " + i + " roll no: ");
			int rollno = scanner.nextInt();
			System.out.println("Enter student " + i + " name: ");
			String name = scanner.next();
			System.out.println("Enter student " + i + " percentage: ");
			double percentage = scanner.nextDouble();
			
			Student student = new Student(rollno, name, percentage);
			students.add(student);
		}
	}
	
	private static void showStudents(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	
	private static void sortByRollNumber(List<Student> students) {
		Collections.sort(students, new StudentComparator.StudentRollNumberComparator());
		
//		students.sort(new StudentRollNumberComparator());
//		students.sort((Student student1, Student student2) -> new Integer(student1.getRollno()).compareTo(student2.getRollno()));
	}
	
	private static void sortByPercentage(List<Student> students) {
//		Collections.sort(students, new StudentComparator.StudentNameComparator());
		students.sort(new StudentComparator.StudentPercentageComparator());
	}
	
	private static void sortByName(List<Student> students) {
//		Collections.sort(students, new StudentComparator.StudentNameComparator());
		students.sort(new StudentComparator.StudentNameComparator());
	}
}
