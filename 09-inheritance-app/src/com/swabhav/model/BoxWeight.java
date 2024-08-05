package com.swabhav.model;

public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int height, int width, int dept, int weight) {
		super(height, width, dept);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", Height=" + getHeight() + ", Width=" + getWidth()
				+ ", Dept=" + getDept() + "]";
	}
	
	
}
