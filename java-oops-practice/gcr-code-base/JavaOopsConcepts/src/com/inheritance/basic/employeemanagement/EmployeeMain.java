package com.inheritance.basic.employeemanagement;
//Main class that display details of manager, developer and intern
public class EmployeeMain {
	 public static void main(String[] args) {
		 
		 //Creating object of manager, developer and intern
		 Employee emp1 = new Manager("Arif","12B",65000,30);
		 Employee emp2 = new Developer("Abuzar","13C",55000,"JAVA");
		 Employee emp3 = new Intern("Ansh","12D",45000,1);
		 
		 //displaying details of different employee
		 System.out.println("-------------------------");
		 emp1.displayDetails();
		 System.out.println("-------------------------");
		 emp2.displayDetails();
		 System.out.println("-------------------------");
		 emp3.displayDetails();
		 System.out.println("-------------------------");
	 }
}
