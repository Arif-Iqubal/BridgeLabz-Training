//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name FormatMultipication and displaying the multipication of a number given by user by 6 to 9 
public class FormatMultipication{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();

	//Displaying the multipication of given number with 6 to 9
	for(int i = 6 ; i <= 9 ; i++ ){

	System.out.println(+number + " * " + i + " = " + ( number * i ));

	}		

	//close the Scanner object
	input.close();
	
	
	
	}




} 