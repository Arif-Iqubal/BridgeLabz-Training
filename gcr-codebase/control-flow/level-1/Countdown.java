 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Countdown and displaying the countdown
public class Countdown{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking countdown details from user
	System.out.println("Enter the countdown : ");
	int counter = input.nextInt();
	
	// displaying the countdown by using while loop
	while (counter != 0){
		
		System.out.println("Countdown : " + counter);
		counter--;
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 