package com.swabhav.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {
	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");

		Method[] methods = stringClass.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		Constructor[] constructors = stringClass.getConstructors();
		for (Constructor constructor : constructors) {
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println(parameter.getName());
			}
		}
	}
}
