# Person Challenge

## N.B:

I have updated the files to move the list of ducks into their own class

## Tasks

1. Create a Person class modelling name, age and job title variables.

```java
public class Person {
	
	// variables

	private String name;
	private int age;
	private String jobTitle;

	// constructor -> overloading
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
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
	
}
```

2. Create a method to return all three of these in a formatted string.

	HINT: @Override the toString() method.

```java
// override toString method

@Override
public String toString() {
	return String.format(
		"[name : " + '"' + name + '"' + 
		", age : " + '"' + age + '"' + 
		", jobTitle : " + '"' + jobTitle + '"' + "],");
}
```

3. Create some example objects with this class.

```java
public class Runner {
	
	public static void main(String[] args) {

		Person p1 = new Person("Hugh Mann", 33, "Head of doing things");
		
		Person p2 = new Person("Sally Jones", 27, "THE BOSS");
		
		Person p3 = new Person("Hacker Man", 42, "master coder");

	}
	
}
```

4. Create a List<> implementation and store those objects inside.

	HINT: it's probably best to put your List<> implementation in a separate class.

```java
public class ListPeople {

	public List<Person> personList = new ArrayList<>();

	public void arrayAdd(Person input) {
		
		personList.add(input);
		
	}
	
}
```

```java
ListPeople lip = new ListPeople();
		
lip.arrayAdd(p1);
lip.arrayAdd(p2);
lip.arrayAdd(p3);
```


5. Create a method that can search for a specific Person by their name.

```java
public void searchName(String name) {
		
	for ( Person i : personList) {
		
		if (i.getName().equals(name)) {
			System.out.println(i);
		}
		
	}
	
}
```

```java
lip.searchName("Sally Jones");
```

6. Use a stream to output all of your people to the console.

	HINT: you can iterate through collections using streams with forEach().

```java
public void streamPeople() {
		
	personList.stream()
		.forEach( Person -> System.out.println(Person) );
	
}
```

## Duck Extension

1. Create a Duck class which models name, isAMallard, and any variables you wish. (Make sure to encapsulate them!)

```java
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

}
```

2. WITHOUT making a new class, create a List<> implementation for your Duck objects

```java
import java.util.List;

...

public List<Duck> duckList = new ArrayList<>();
```

3. Create methods to print out:
	1. the entire Duck List

	```java
	public void printDuckList() {
		System.out.println(duckList);
	}
	```

	2. every Duck object that is a mallard

	```java
	public void mallardCheck() {
		
		for ( Duck i : duckList) {
			
			if (i.isAMallard == true) {
				System.out.println(i);
			}
			
		}
		
	}
	```


	3. Create a method which sorts the Duck List by name, and prints the whole list (HINT: use the .sort() List method)

	```java

	import java.util.Collections;
	import java.util.Comparator;

	...

	public void duckSort() {
		
		Collections.sort(duckList, new Comparator<Duck>() {
			
			public int compare(Duck a, Duck b) {
				return a.name.compareTo(b.name);
			}
			
		});
		
		System.out.println(duckList);
		
	}
	```