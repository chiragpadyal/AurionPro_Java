package com.swabhav.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.swabhav.model.IStudentService;
import com.swabhav.model.Student;

class StudentTest {

	private IStudentService studentService;
	private Student student;
	
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}
	@Test
	void test() {
		Mockito.when(studentService.getMarks()).thenReturn(650);
		Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10);
		
		assertEquals(65.0, student.getPercentage());
	}

}
