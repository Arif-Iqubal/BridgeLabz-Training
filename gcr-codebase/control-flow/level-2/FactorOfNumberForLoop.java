//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name FactorOfNumberForLoop and displaying the factor of number
public class FactorOfNumberForLoop{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();

	//checking the number is positive or not
	if(number >= 0){

		//Displaying the factor of number from 1 to given number
		for(int i = 1 ; i < number ; i++){
			
			if(number % i == 0){
				System.out.println("The number " + i + " is the factor of " + number);
			}
			
		}
		
	}
	else{
		System.out.println("The number " + number + " is not positive");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 