package com.swabhav.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.swabhav.model.Operations;


class OperationsTest {

	Operations ops;
	@BeforeEach
	void init() {
		ops = new Operations();
	}
	
	@BeforeAll
	static void initBefore() {
		System.out.println("Starting test");
	}
	

	@AfterEach
	void finish() {
		System.out.println("done");
	}
	
	@Test
	void testAddition() {
		Operations ops = new Operations();
		assertEquals(10, ops.addition(5, 5), "This function must do addition");
	}
	
	@Test
	void testMultiplication() {
		Operations ops = new Operations();
		assertEquals(25, ops.multiplication(5, 5), "This function must do multiplication");
	}
	
	@Test
	void testSubtraction() {
		Operations ops = new Operations();
		assertEquals(0, ops.subtraction(5, 5), "This function must do subtraction");
	}
	
	@Test
	void testDivision() {
		Operations ops = new Operations();
		assertEquals(1, ops.division(5, 5), "This function must do division");
//		assertThrows(ArithmeticException.class, ()->ops.division(5, 0));
	}

	
}
