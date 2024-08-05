package com.techlabs.test;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			double division = number1 / number2;
			System.out.println("Division : " + division);
		} catch (ArithmeticException exception) {
			System.out.println("Number cannot be zero");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Give two value as input");
		} catch(NumberFormatException exception) {
			System.out.println("Enter number value only!");
		} catch(Exception exception) {
			System.out.println("Something went wrong!");
		} finally {
			System.out.println("Exiting!");
		}
	}
}
