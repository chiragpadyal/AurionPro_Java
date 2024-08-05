package com.sawbhav.test;

import com.sawbhav.model.Box;

public class Boxtest {

	public static void main(String[] args) {
		Box box = new Box();
		System.out.println(box.toString());
		
		box.setDept(10);
		box.setHeight(20);
		box.setWidth(30);
		
		System.out.println(box.toString());
		
		Box box2 = new Box(3,4,5);
		System.out.println(box2.toString());
	}

}
