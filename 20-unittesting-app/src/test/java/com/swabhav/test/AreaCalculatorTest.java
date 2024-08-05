package com.swabhav.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.swabhav.model.AreaCalculator;

class AreaCalculatorTest {
	
	static AreaCalculator area;
	
	@BeforeAll
	static void init() {
		area = new AreaCalculator();
	}

	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, area.calculateAreaOfCircle(5));
	}
	
	@Test
	void testCalculateAreaOfTriangle() {
		assertEquals(12.5, area.calculateAreaOfTriangle(5, 5));
	}
	
	@Test
	void testCalculateAreaOfSquare() {
		assertEquals(25, area.calculateAreaOfSquare(5));
	}
	
	@Test
	void testCalculateAreaOfRectangle() {
		assertEquals(50, area.calculateAreaOfRectangle(5, 10));
	}

}
