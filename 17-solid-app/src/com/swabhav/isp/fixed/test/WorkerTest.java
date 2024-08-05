package com.swabhav.isp.fixed.test;

import com.swabhav.isp.fixed.model.ILabour;
import com.swabhav.isp.fixed.model.IRobot;
import com.swabhav.isp.fixed.model.Labour;
import com.swabhav.isp.fixed.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		IRobot robot = new Robot();
		ILabour labour = new Labour();
		
		robot.startWork();
		robot.stopWork();

		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();		
		
	}
}
