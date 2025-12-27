package com.constructorandinstance.level1;

public class PostgraduateStudent extends Student {

	PostgraduateStudent(String rollNumber, String name, double CGPA) {
		super(rollNumber, name, CGPA);
		
	}

	public static void main(String[] args) {
		// Create object of sub class
		PostgraduateStudent pgStudent1 = new PostgraduateStudent("0192al221018","Anuj Gupta",9.1);
		pgStudent1.displayDetails();
		pgStudent1.setCGPA(8.5);//Using set method to set private value
		pgStudent1.name = "Anuj";//protected can be accessible in sub class
		pgStudent1.displayDetails();
	}

}
