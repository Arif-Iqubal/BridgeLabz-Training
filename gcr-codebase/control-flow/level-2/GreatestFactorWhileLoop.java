//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name GreatestFactorWhileLoop and displaying the greatest factor of number using While loop
public class GreatestFactorWhileLoop{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();

	//checking the number is positive or not
	if(number >= 0){

		//Displaying the gratest factor of the given number
		int i = number - 1;
		
		while( i > 0 ){
			
			if(number % i == 0){
				System.out.println("The number " + i + " is the greatest factor of " + number);
				break;
			}
			i--;
			
		}
		
	}
	else{
		System.out.println("The number " + number + " is not positive");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 