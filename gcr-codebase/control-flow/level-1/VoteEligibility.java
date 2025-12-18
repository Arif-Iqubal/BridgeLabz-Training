//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name VoteEligibility and checking whether the person is eligible for vote or not
public class VoteEligibility{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for the age of person
	System.out.println("Enter the age of person : ");
	int age = input.nextInt();
	
	
	// Checking and displaying whether the person is eligible for vote or not
	if(age>=18){
		System.out.println("The person's age is " + age + " and can vote.");
		
	}
	else{
		System.out.println("The person's age is " + age + " and cannot vote.");
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 