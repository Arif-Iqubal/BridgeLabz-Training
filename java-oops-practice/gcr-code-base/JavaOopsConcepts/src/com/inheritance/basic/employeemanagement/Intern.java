package com.inheritance.basic.employeemanagement;
//Inheriting properties of Employee class
public class Intern extends Employee{
	private int duration ;
	
	//Parameterized constructor
	public Intern(String name, String id, int salary, int duration) {
		super(name, id, salary);
		this.duration = duration;
	}
	@Override
	public void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
		System.out.println("Duration = " + duration + " Year");
	}
}
