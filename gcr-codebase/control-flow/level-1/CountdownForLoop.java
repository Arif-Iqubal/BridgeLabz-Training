 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name CountdownForLoop and displaying the countdown using for loop
public class CountdownForLoop{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking countdown details from user
	System.out.println("Enter the countdown : ");
	int counter = input.nextInt();
	
	// displaying the countdown by using for loop
	for( ; counter>0 ; counter--){
		
		System.out.println("Countdown : " + counter);
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 