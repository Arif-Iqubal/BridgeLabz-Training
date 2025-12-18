//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name AllMultiplesWhileLoop and displaying all the multiples of the given number
public class AllMultiplesWhileLoop{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();

	//checking the number is positive and smaller than 100
	if((number >= 0) && (number < 100)){

		//Displaying the multiple of number from 1 to given number
		int i = number  ;
		while( i > 0 ){
			
			if(number % i == 0){
				System.out.println("The number " + i + " is the multiple of " + number);
			}
			i--;
		}
		
	}
	else{
		System.out.println("The number " + number + " is not positive or, greater or equal to 100");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 