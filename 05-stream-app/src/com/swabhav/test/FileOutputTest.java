package com.swabhav.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream("D:\\training\\05-stream-app\\src\\com\\swabhav\\test\\text");
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\training\\05-stream-app\\src\\com\\swabhav\\test\\text2");

			int ch;
			while((ch = fileInputStream.read()) != -1) {
				fileOutputStream.write(ch);
			}
			
			System.out.println("File Copied Successfully");
			fileInputStream.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
			
	}
}
