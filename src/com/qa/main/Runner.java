package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		//Person per = new Person();
		
		//System.out.println(per.toString());
		
		Person Person1 = new Person();
		Person1.setName("Hugh Mann");
		Person1.setAge(33);
		Person1.setJobTitle("Head of doing things");

		//System.out.println(Person1.toString());
		
		Person Person2 = new Person();
		Person2.setName("Sally Jones");
		Person2.setAge(27);
		Person2.setJobTitle("THE BOSS");
		
		Person Person3 = new Person();
		Person3.setName("Hacker Man");
		Person3.setAge(42);
		Person3.setJobTitle("master coder");
		
		ListPeople lip = new ListPeople();
		
		lip.arrayAdd(Person1);
		lip.arrayAdd(Person2);
		lip.arrayAdd(Person3);
		
		//lip.searchName("Sally Jones");	
		lip.streamPeople();
	}
	
}
