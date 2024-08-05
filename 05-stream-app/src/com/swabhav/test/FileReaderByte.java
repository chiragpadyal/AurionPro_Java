package com.swabhav.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderByte {
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream("D:\\training\\05-stream-app\\src\\com\\swabhav\\test\\text");
			int ch;
			while((ch = fileInputStream.read()) != -1) {
				System.out.print((char) ch);
			}
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
			
	}
}
