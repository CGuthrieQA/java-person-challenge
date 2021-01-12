package com.qa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class DuckManager {
	
	public List<Duck> duckList = new ArrayList<>();

	public void printDuckList() {
		System.out.println(duckList);
	}
	
	public void mallardCheck() {
		
		for ( Duck i : duckList) {
			
			if (i.isAMallard()) {
				System.out.println(i);
			}
			
		}
		
	}
	
	public void duckSort() {
		
		Collections.sort(duckList, new Comparator<Duck>() {
			
			public int compare(Duck a, Duck b) {
				return a.getName().compareTo(b.getName());
			}
			
		});
		
		System.out.println(duckList);
		
	}
}
