package com.inheritance.basic.employeemanagement;
//Super class
public class Employee {
	protected String name;
	protected String id;
	protected int salary;
	
	public Employee(String name,String id,int salary) {
		this.name= name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Showing Employee Details");
	}
}
