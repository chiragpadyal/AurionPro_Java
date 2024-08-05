package com.techlabs.selection.test;

import java.util.Scanner;

public class TemperatureConvertor {
// convert to F and K from C
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
 
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Kelvin");
 
        int choice = scanner.nextInt();
        double conversion;
        switch (choice) {
		case 1:
			conversion =  (temperature * 9/5) + 32;
			System.out.println(temperature + "° Celsius is " + conversion + "° Fahrenheit");
			break;
		case 2:
			conversion =  (temperature - 32) * 5/9;
			System.out.println(temperature + "° Fahrenheit is " + conversion + "° Celsius");
			break;
		case 3:
			conversion = temperature + 273.15;
			System.out.println(temperature + "° Celsius is " + conversion  + "° Kelvin");
			break;
		case 4:
			conversion = temperature - 273.15;
			System.out.println(temperature + "° Kelvin is " + conversion + "° Celsius");
			break;
		case 5:
			conversion = (temperature - 32) * 5/9 + 273.15;
			System.out.println(temperature + "° Fahrenheit is " + conversion + "° Kelvin");
			break;
		case 6:
			conversion = (temperature - 273.15) * 9/5 + 32;
			System.out.println(temperature + "° Kelvin is " + conversion + "° Fahrenheit");
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
        
        
        scanner.close();
	}
}
