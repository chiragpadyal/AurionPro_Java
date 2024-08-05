package com.swabhav.model;

import java.util.Scanner;

public class MatrixTest {
	 public static void main(String[] args) {
		 int matrix[][] = new int[3][3];
		 
		 Scanner scanner =  new Scanner(System.in);
		 System.out.println("Enter the elements: ");
		 createMatrix(matrix, scanner);
		 System.out.println("Matrix is :");
		 readMatrix(matrix);
	}
	 
	 private static void createMatrix(int[][] matrix, Scanner scanner) {
		 for (int i = 0; i < matrix.length; i++) {
			writeRowElement(matrix, scanner, i);
		}
	 }
	 
	 private static void writeRowElement(int[][] matrix, Scanner scanner, int i) {
		 for (int j = 0; j < matrix[i].length; j++) {
			 System.out.println("Enter element col: "+ i + " row: " + j);
			matrix[i][j] = scanner.nextInt();
		}
	 }
	 
	 private static void readMatrix(int[][] matrix) {
		 for (int i = 0; i < matrix.length; i++) {
			readRowElement(matrix, i); 
			System.out.println("\n");
		}
	 }
	 
	 private static void readRowElement(int[][] matrix, int i) {
		 for (int j = 0; j < matrix[i].length; j++) {
			System.out.print(matrix[i][j] + " ");
		}
	 }
	 

}
