package com.inheritance.multilevel.educationalcourse;
//Main class that display details
public class CourseApp {
    public static void main(String[] args) {
    	//Creating object of paidonlinecourse class
        PaidOnlineCourse course =
                new PaidOnlineCourse("Java", 40, "Udemy", true, 5000, 20);
        //Displaying fees details
        course.displayFeeDetails();
    }
}

