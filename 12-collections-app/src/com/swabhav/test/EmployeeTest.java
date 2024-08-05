package com.swabhav.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.swabhav.model.Employee;
import com.swabhav.model.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		addEmployees(scanner, employees);
		System.out.println("------------ UnSorted List ------------");
		showEmployees(employees);
		
		System.out.println("------------ Sorted List By Name ------------");
		sortByName(employees);
		showEmployees(employees);
		
		System.out.println("------------ Sorted List By Employee Id ------------");
		sortByRollNumber(employees);
		showEmployees(employees);
		
		System.out.println("------------ Sorted List By Salary ------------");
		sortByPercentage(employees);
		showEmployees(employees);
	}
	
	
	private static void addEmployees(Scanner scanner, List<Employee> employees) {
		System.out.println("Enter number Of employees to create");
		int numberOfEmployees = scanner.nextInt();
		for (int i = 1; i <= numberOfEmployees; i++) {
			System.out.println("-----------------------------------");
			System.out.println("Enter employee " + i + " id: ");
			int id = scanner.nextInt();
			System.out.println("Enter emplyees " + i + " name: ");
			String name = scanner.next();
			System.out.println("Enter employee " + i + " salary: ");
			double salary = scanner.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
		}
	}
	
	private static void showEmployees(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	private static void sortByRollNumber(List<Employee> employees) {
		employees.sort(new EmployeeComparator.EmployeeIdComparator());
	}
	
	private static void sortByPercentage(List<Employee> employees) {
		employees.sort(new EmployeeComparator.EmployeeSalaryComparator());
	}
	
	private static void sortByName(List<Employee> employees) {
		employees.sort(new EmployeeComparator.EmployeeNameComparator());
	}
}
