package com.constructorandinstance.level1;

public class Employee {
	public String employeeID;
	protected String department;
	private int salary;
	
	//Parameterized constructor
	Employee(String employeeID, String department, int salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	//Set private value using setter method
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//Getting details of employee salary using getter method
	public void getSalary(){
		System.out.println("Salary => " + this.salary);
	}
	
	public void displayDetails() {
		System.out.println("Employee ID => " + employeeID);
		System.out.println("Department => " + department);
		System.out.println("Salary => " + salary);
	}
	public static void main(String[] args) {
		// Creating object of class 
		Employee employee1 = new Employee("238B","Back-End",7000);
		employee1.displayDetails();
		employee1.setSalary(8000);
		employee1.getSalary();
		employee1.displayDetails();
		
	}

}

