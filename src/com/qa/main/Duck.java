package com.qa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

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
	
	public List<Duck> duckList = new ArrayList<>();
	
	public void printDuckList() {
		System.out.println(duckList);
	}
	
	public void mallardCheck() {
		
		for ( Duck i : duckList) {
			
			if (i.isAMallard == true) {
				System.out.println(i);
			}
			
		}
		
	}

	
	public void duckSort() {
		
		Collections.sort(duckList, new Comparator<Duck>() {
			
			public int compare(Duck a, Duck b) {
				return a.name.compareTo(b.name);
			}
			
		});
		
		System.out.println(duckList);
		
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
