package com.inheritance.basic.employeemanagement;

//Inheriting properties of employee class
public class Manager extends Employee {
	private int teamSize ;
	public Manager(String name, String id, int salary,int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
		System.out.println("Team Size = " + teamSize);
	}

}
