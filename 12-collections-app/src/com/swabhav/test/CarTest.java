package com.swabhav.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.swabhav.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<Car>();
		addCars(scanner, cars);
		showCars(cars);
		System.out.println("Car with maximum mileage is: ");
		System.out.println(maximumMileage(cars));
	}
	
	
	private static void addCars(Scanner scanner, List<Car> cars) {
		System.out.println("Enter the number of cars to be added: ");
		int numberOfCars = scanner.nextInt();
		for (int i = 1; i <= numberOfCars; i++) {
			System.out.println("-----------------------------------");
			System.out.println("Enter car " + i + " Id: ");
			int carId = scanner.nextInt();
			System.out.println("Enter car " + i + " company name: ");
			String companyName = scanner.next();
			System.out.println("Enter car " + i + " price: ");
			double price = scanner.nextDouble();
			System.out.println("Enter car " + i + " mileage: ");
			double mileage = scanner.nextDouble();
			
			Car car = new Car(carId, companyName, price, mileage);
			cars.add(car);
		}
	}
	
	private static void showCars(List<Car> cars) {
		for (Car car : cars) {
			System.out.println(car);
		}
		
	}
	
	private static Car maximumMileage(List<Car> cars) {
		double maxMileage = 0;
		Car maxCar = null;
		for (Car car : cars) {
			if(maxMileage <= car.getMileage()) {
				maxMileage = car.getMileage();
				maxCar = car;
			}
			
		}
		return maxCar;
		
	}
	

}
