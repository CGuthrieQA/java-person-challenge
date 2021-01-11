package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		//Person per = new Person();
		
		//System.out.println(per.toString());
		
//		Person Person1 = new Person();
//		Person1.setName("Hugh Mann");
//		Person1.setAge(33);
//		Person1.setJobTitle("Head of doing things");


		Person p1 = new Person("Hugh Mann", 33, "Head of doing things");
		
		//System.out.println(p1.toString());
		
		Person p2 = new Person("Sally Jones", 27, "THE BOSS");
		
		Person p3 = new Person("Hacker Man", 42, "master coder");
		
		ListPeople lip = new ListPeople();
		
		lip.arrayAdd(p1);
		lip.arrayAdd(p2);
		lip.arrayAdd(p3);
		
		//lip.searchName("Sally Jones");	
		lip.streamPeople();
	}
	
}
