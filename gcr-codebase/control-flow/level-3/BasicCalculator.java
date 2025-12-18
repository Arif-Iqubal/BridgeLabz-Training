//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name BasicCalculator and Create a basic calculator
public class BasicCalculator{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for two numbers and operation
	System.out.println("Enter first number : ");
	double first = input.nextInt();
	System.out.println("Enter second number : ");
	double second = input.nextInt();
	System.out.println("Enter operations like +, -, * and / : ");
	String op = input.next();
	double answer;  // declearing a varible to store answer
	
	//using switch statement to create basic calculator
	
	
	switch(op){
		case "+":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + ( first + second ));
			break;
		}
		case "-":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + ( first - second ));
			break;
		}
		case "*":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + ( first * second ));
			break;
		}
		case "/":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + ( first / second ));
			break;
		}
		default :
		{
		System.out.println("Invalid Operator" + op);
			break;
		}
		
		
	}
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 