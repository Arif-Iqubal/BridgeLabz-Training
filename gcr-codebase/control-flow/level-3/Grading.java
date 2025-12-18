//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Grading and calculate and display the grade of student
public class Grading{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for subject score details
	System.out.println("Enter math's marks : ");
	double mathsMarks = input.nextInt();
	System.out.println("Enter physics marks : ");
	double physicsMarks = input.nextInt();
	System.out.println("Enter chemistry marks : ");
	double chemistryMarks = input.nextInt();
	int totalMarks = 300;
	
	//calculating the average marks of student
	double averageMarks = ((mathsMarks + physicsMarks + chemistryMarks) / 3 ) ;
	
	//calculating the percentage of student
	double percentage = ((mathsMarks + physicsMarks + chemistryMarks) / totalMarks ) * 100 ;
	
	//Displaying the grade and remarks of student
	if(percentage >= 80 ){
		System.out.println("The grade for average marks " + averageMarks + " is A with remakrs (Level 4, above agency-normalized standards)" );
	}
	else if(percentage >= 70 ){
		System.out.println("The grade for average marks " + averageMarks + " is B with remakrs (Level 3, at agency-normalized standards)" );
	}
	else if(percentage >= 60 ){
		System.out.println("The grade for average marks " + averageMarks + " is C with remakrs (Level 2, below, but approaching agency-normalized standards)" );
	}
	else if(percentage >= 50 ){
		System.out.println("The grade for average marks " + averageMarks + " is D with remakrs (Level 1, well below agency-normalized standards)" );
	}
	else if(percentage >= 40 ){
		System.out.println("The grade for average marks " + averageMarks + " is E with remakrs (Level 1- , too below agency-normalized standards)" );
	}
	else{
		System.out.println("The grade for average marks " + averageMarks + " is R with remakrs (Remedial standards )" );
	}
	//close the Scanner object
	input.close();
	
	
	
	}




} 