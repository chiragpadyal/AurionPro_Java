package com.swabhav.test;

import java.util.Scanner;

import com.swabhav.model.Car;

public class CarTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the car companyname: ");
		String companyname = scanner.next();
		System.out.println("Enter the car mileage: ");
		double mileage = scanner.nextDouble();
		System.out.println("Enter the car price: ");
		double price = scanner.nextDouble();
		
		Car car = new Car(companyname, mileage, price);
		
		System.out.println(car);
	}
}
