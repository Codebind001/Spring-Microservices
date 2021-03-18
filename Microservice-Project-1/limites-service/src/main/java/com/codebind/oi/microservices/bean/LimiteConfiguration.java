package com.codebind.oi.microservices.bean;

public class LimiteConfiguration {
	
	private int maximum;
	private int minimum;
	
	protected LimiteConfiguration() {
		
	}
	
	public LimiteConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	

}
