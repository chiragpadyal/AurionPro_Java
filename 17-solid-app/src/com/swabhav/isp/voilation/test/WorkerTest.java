package com.swabhav.isp.voilation.test;

import com.swabhav.isp.voilation.model.IWorker;
import com.swabhav.isp.voilation.model.Labour;
import com.swabhav.isp.voilation.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		IWorker robot = new Robot();
		IWorker labour = new Labour();
		
		robot.startWork();
		robot.stopWork();
		robot.eat();
		robot.drink();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();		
		
	}
}
