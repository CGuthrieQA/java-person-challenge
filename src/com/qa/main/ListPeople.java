package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class ListPeople {

	public List<Person> personList = new ArrayList<>();

	public void arrayAdd(Person input) {
		
		personList.add(input);
		
	}
	
	public void searchName(String name) {
		
		for ( Person i : personList) {
			
			if (i.getName().equals(name)) {
				System.out.println("name found");
			}
			
		}
		
	}
	
}
