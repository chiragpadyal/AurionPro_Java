package com.swabhav.structural.composite.test;

import com.swabhav.structural.composite.model.CompositeParts;
import com.swabhav.structural.composite.model.IPart;
import com.swabhav.structural.composite.model.Part;

public class PartTest {
	public static void main(String[] args) {
		
		CompositeParts compositePart = new CompositeParts("Computer", 900);
		
		IPart part1 = new Part("Cabinet", 300);
		IPart part2 = new Part("Peripherals", 300);
		compositePart.addItem(part1);
		compositePart.addItem(part2);
		
		CompositeParts subCompositePart = new CompositeParts("Motherboard", 900);
		IPart part1sub1 = new Part("Ram", 300);
		IPart part1sub2 = new Part("Storage", 300);
		IPart part2sub1 = new Part("Monitor", 300);
		IPart part2sub2 = new Part("KeyBoard", 300);
		subCompositePart.addItem(part1sub1);
		subCompositePart.addItem(part1sub2);
		subCompositePart.addItem(part2sub1);
		subCompositePart.addItem(part2sub2);
		
		compositePart.addItem(subCompositePart);
		
		compositePart.display();
	}
}
