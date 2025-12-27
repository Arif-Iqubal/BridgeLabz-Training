package com.constructorandinstance.level1;

public class Course {
	
	//Declaring Instance Variable
	String courseName;
	int duration;
	int fees;
	// Initializing class variable
	static String instituteName  = "TIT&S";
	
	//Parameterized constructor
	Course(String courseName, int duration, int fees){
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	
	//Creating a instance method to display details
	void displayCourseDetails() {
		System.out.println("Course Name => " + courseName);
		System.out.println("Duration => " + duration);
		System.out.println("Fees => " + fees);
		System.out.println("Institute Name => " + instituteName);
	}
	
	//Creating a class method to update the institute name
	static void updateInstituteName() {
		instituteName = "TIT Main";
	}
	
	public static void main(String[] args) {
		//Creating object of product class
		Course course1 = new Course("B.Tech",4,300000);
		Course course2 = new Course("Diploma",3 , 100000);
		Course course3 = new Course("Law",7 , 400000);
		Course course4 = new Course("Pharmacy",3 , 200000);
		
		
		//Displaying details
		course1.displayCourseDetails();
		course2.displayCourseDetails();
		//Update Institute name for all objects
		Course.updateInstituteName();
		course3.displayCourseDetails();
		course4.displayCourseDetails();

		
	
		
		
	}
}

