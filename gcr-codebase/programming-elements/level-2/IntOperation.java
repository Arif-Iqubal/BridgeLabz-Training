//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IntOperation and displaying mathematical operations
public class IntOperation{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Takking input of 3 different number from user
	System.out.println("Enter the first number : ");
	int number_1 = input.nextInt();
	System.out.println("Enter the second number : ");
	int number_2 = input.nextInt();
	System.out.println("Enter the third number : ");
	int number_3 = input.nextInt();
	

	// Performing the mathematical operations a + b *c, a * b + c, c + a / b, and a % b + c
	int operation_1 = number_1 + number_2 * number_3;
	int operation_2 = number_1 * number_2 + number_3;
	int operation_3 = number_3 + number_1 / number_2;
	int operation_4 = number_1 % number_2 + number_3;


	
	
	// displaying the mathematical operation solutions
	System.out.println("The results of Int Operations are " +operation_1 + ", " + operation_2 + ", " + operation_3 + " and " + operation_4 );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 