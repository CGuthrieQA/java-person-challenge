package com.qa.main;


public class Duck {
	
	// variables
	private String name;
	private boolean isAMallard;
	private int weight;
	
	// constructor -> overloading
	
	public Duck(String name, boolean isAMallard, int weight) {
		this.name = name;
		this.isAMallard = isAMallard;
		this.weight = weight;
	}

	// getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAMallard() {
		return isAMallard;
	}
	public void setAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// override toString method
	
	@Override
	public String toString() {
		return String.format(
			" name : " + '"' + name + '"' + 
			" / isAMallard : " + '"' + isAMallard + '"' + 
			" / weight : " + '"' + weight + '"' + " ");
	}
		

}
