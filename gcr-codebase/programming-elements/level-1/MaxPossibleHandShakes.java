//importing Scanner class from java.util package
import java.util.Scanner;



//Creating a class name MaxPossibleHandShakes to calculate the maximum handshaked by given student

public class MaxPossibleHandShakes{

	public static void main(String[] args){
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking student number as input
	System.out.println("Enter the number of students : ");
	int numberOfStudent = input.nextInt();
		
	// Calculating the maximum possible handshaked by given student
	int maxhandShakes = (numberOfStudent * ( numberOfStudent - 1 )) / 2 ;
	
	

	
	// Display the maximum number of handshaked by given number of student
	System.out.println("The the maximum number of handshaked by given number of student is " + maxhandShakes );
	
	//close the Scanner object
	input.close();
	
	
	}




} 