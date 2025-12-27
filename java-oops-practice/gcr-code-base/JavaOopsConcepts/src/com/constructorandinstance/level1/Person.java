package com.constructorandinstance.level1;

public class Person {
	//Declaring non-static variables for persons details
	String name;
	int age;
	int height;
	
	//Parameterized constructor
	Person(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//Copy constructor
	Person(Person person){
		this.name = person.name;
		this.age = person.age;
		this.height = person.height;
	}
	
	//Display method
	void display(){
		System.out.println("Name => " + this.name);
		System.out.println("Age =>  " + this.age);
		System.out.println("Height => " + this.height);
	}
	public static void main(String[] args) {
		// Creating object of class person
		Person person1 = new Person("Aman", 24, 167);
		Person person2 = new Person("Rohan", 43, 180);
		
		//Creating object using copy constructor
		Person person3 = new Person(person1);
		
		//Displaying details of person
		person1.display();
		person2.display();
		person3.display();

	}

}
