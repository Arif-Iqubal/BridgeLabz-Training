package com.universitydigitalrecord;

//Class Student to store details of student
public class Student {

	// Instance of class
	String name;
	String branch;
	int semister;
	int roll;
	Student left;
	Student right;

	// Parameterized constructor
	public Student(String name, String branch, int semister, int roll) {

		this.name = name;
		this.branch = branch;
		this.semister = semister;
		this.roll = roll;
		this.left = null;
		this.right = null;
	}

}
