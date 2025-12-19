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
		
	//declaring 1D array
	String[] result = new String[number+1];

		result[0] = "0";
		for(int i = 1 ; i <= number ; i++ ){

			//checking whether the number is multiple of 5 or 3 to print fizz and buzz
			if((i%3==0) && (i%5==0)){
				result[i]= "FizzBuzz";
				
			}
			else if(i%3==0){
				result[i] = "Fizz";
				
			}
			else if(i%5==0){
				result[i] = ("Buzz");
				
			}
			else {
				result[i] = Integer.toString(i);
				
			}
		
		}

		//Displaying the result
		for(int i = 0 ; i <= number ; i++){
			 System.out.println("Position " + i + " = " + result[i]);
			 
		}



		
	}
	else{
		System.out.println("The number " + number + " is not positive");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 