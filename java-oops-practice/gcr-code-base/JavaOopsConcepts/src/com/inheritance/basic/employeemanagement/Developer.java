package com.inheritance.basic.employeemanagement;
//Inheriting property of Employee class
public class Developer extends Employee {
	
	private String programmingLanguage ;
	public Developer(String name, String id, int salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	//overriding display method
	public void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
		System.out.println("Programming language= " + programmingLanguage);
	}

}
