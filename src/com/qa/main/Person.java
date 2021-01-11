package com.qa.main;

public class Person {
	
	// variables

	private String name;
	private int age;
	private String jobTitle;
	
	// getters
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}
	
	// setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	// override toString method
	
	@Override
	public String toString() {
		return String.format("[\r\nname : " + '"' + name + '"' + ",\r\nage : " + '"' + age + '"' + ",\r\njobTitle : " + '"' + jobTitle + '"' + "\r\n],");
	}
	
}
