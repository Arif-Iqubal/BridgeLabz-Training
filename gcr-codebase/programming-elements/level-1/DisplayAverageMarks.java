//Creating a class name DisplayAverageMarks to display Sam's average marks of three subjects.

public class DisplayAverageMarks{

	public static void main(String[] args){
	// Creating a variable string and initializing it as Sam
	String name = "Sam";
	
	// Creating a variable integer and storing the marks got in maths
	int mathMarks = 94;
	
	// Creating a variable integer and storing the marks got in physics
	int physicsMarks = 95;
	
	// Creating a variable integer and storing the marks got in chemistry
	int chemistryMarks = 96;
	
	// Calculating average marks
	int averageMarks  = (mathMarks + physicsMarks + chemistryMarks) / 3 ;
	
	// Display the average marks
	System.out.println(""+name +"'s average mark in PCM is " + averageMarks);
	
	
	}




} 