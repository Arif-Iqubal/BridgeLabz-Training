//Creating a class name PenDistribution and displaying the pen distributed among pepole

public class PenDistribution{

	public static void main(String[] args){
	
	// Creating a integer variable and storing the number of pens
	int numberOfPens = 14;
	
	// Creating a integer variable and storing the number of student
	int numberOfStudents = 3;
	
	
	
	
	//Calulating the pen distributed to each student
	int penPerStudent = numberOfPens / numberOfStudents ;
	
	//Calulating the remaining pens
	int remainingPens = numberOfPens % numberOfStudents ;
	
	// displaying pen per student and remaining pens
	System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
	
	
	
	
	
	}




} 