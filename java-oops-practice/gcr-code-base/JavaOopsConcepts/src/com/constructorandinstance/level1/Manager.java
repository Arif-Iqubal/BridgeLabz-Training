package com.constructorandinstance.level1;
//Inheriting properties of Employee class
public class Manager extends Employee {

	Manager(String employeeID, String department, int salary) {
		super(employeeID, department, salary);
		
	}

	public static void main(String[] args) {
		// Creating object of manager Class
		Manager manager1 = new Manager("237A","Front-End",9000);
		
		//Accessing public instance of parent class
		System.out.println("Assess public instance of parent class \n Employee ID => " + manager1.employeeID);

		//Accessing protected instance of parent class
		System.out.println("Assess protected instance of parent class \n Department => " + manager1.department);

	}

}
