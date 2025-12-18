//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name FizzBuzz and displaying the result as fizz or buzz or fizzbuzz
public class FizzBuzz{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();

	//checking the number is positive or not
	if(number >= 0){

		//Displaying the multipication of given number with 6 to 9
		for(int i = 1 ; i <= number ; i++ ){

			//checking whether the number is multiple of 5 or 3 to print fizz and buzz
			if((i%3==0) && (i%5==0)){
				System.out.println("FizzBuzz");
				
			}
			else if(i%3==0){
				System.out.println("Fizz");
				
			}
			else if(i%5==0){
				System.out.println("Buzz");
				
			}
			else {
				System.out.println(+i);
				
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