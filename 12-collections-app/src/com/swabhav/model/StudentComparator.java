package com.swabhav.model;

import java.util.Comparator;

public class StudentComparator {
	public static class StudentNameComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {

//			return student1.getName().compareToIgnoreCase(student2.getName());
			return student1.getName().compareTo(student2.getName());
		}
		
	}
	
	public static class StudentPercentageComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			return new Double(student1.getPercentage()).compareTo(student2.getPercentage());
		}
		
	}
	
	public static class StudentRollNumberComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
//			if(student1.getRollno() > student2.getRollno()) return 1;
//			if(student1.getRollno() < student2.getRollno()) return -1;
//			return 0;
			
			return new Integer(student1.getRollno()).compareTo(student2.getRollno());
		}
		
	}

}
