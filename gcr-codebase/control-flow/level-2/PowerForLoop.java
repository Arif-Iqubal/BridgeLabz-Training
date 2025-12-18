//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name PowerForLoop and calculate and display the power of a number
public class PowerForLoop{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number and its power
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	System.out.println("Enter its power : ");
	int power = input.nextInt();
	
	int result = 1 ; 

	//checking the number is positive or not
	if(number >= 0){

		//Displaying the power of the number
		for(int i = 0 ; i < power ; i++){
			
			result *= number;
			
		}
		
		System.out.println("" + number + " to the power " + power + " is " + result );
		
	}
	else{
		System.out.println("The number " + number + " is not positive ");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 