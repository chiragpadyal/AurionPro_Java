package com.swabhav.model;

public class Student {
	private IStudentService studentService;

	public Student(IStudentService studentService) {
		this.studentService = studentService;
	}
	
	public double getPercentage() {
		return studentService.getMarks() / studentService.getNumberOfSubjects();
	}
	
}
