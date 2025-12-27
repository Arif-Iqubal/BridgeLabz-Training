package com.constructorandinstance.level1;

public class Student {
	public String rollNumber;
	protected String name;
	private double CGPA;
	
	//Parameterized constructor
	Student(String rollNumber, String name, double CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	//Set private value using setter method
	public void setCGPA(double CGPA) {
		if(CGPA>0.0 && CGPA<=10.0) {
			this.CGPA = CGPA;
		}
		else {
			System.out.println("Invalid CGPA");
		}
	}
	//Getting details of CGPA using getter method
	public void getCGPA(){
		System.out.println("CGPA => " + this.CGPA);
	}
	
	public void displayDetails() {
		System.out.println("Roll number => " + rollNumber);
		System.out.println("Name => " + name);
		System.out.println("CGPA => " + CGPA);
	}
	public static void main(String[] args) {
		// Creating object of class 
		Student student1 = new Student("0192Al221019","Arif Iqubal",8.11);
		student1.displayDetails();
		student1.setCGPA(8.45);
		student1.displayDetails();
		
	}

}
