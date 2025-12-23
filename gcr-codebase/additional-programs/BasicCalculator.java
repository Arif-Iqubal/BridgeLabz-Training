//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name BasicCalculator and Create a basic calculator
public class BasicCalculator{
	
	//Method to add two number
	public static double add(double first, double second){
		return first + second;
	}
	//Method to subtract two number
	public static double subtract(double first, double second){
		return first - second;
	}
	//Method to multiply two number
	public static double multiply(double first, double second){
		return first * second;
	}
	//Method to divide two number
	public static double divide(double first, double second){
		return first / second;
	}

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for two numbers and operation
	System.out.println("Enter first number : ");
	double first = input.nextDouble();
	System.out.println("Enter second number : ");
	double second = input.nextDouble();
	System.out.println("Enter operations like +, -, * and / : ");
	String op = input.next();
	double answer;  // declearing a varible to store answer
	
	//using switch statement to create basic calculator and calling method to compute arithmetic operation
	
	
	switch(op){
		case "+":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + (add( first , second )));
			break;
		}
		case "-":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + (subtract( first , second )));
			break;
		}
		case "*":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + (multiply( first , second )));
			break;
		}
		case "/":
		{
		System.out.println("" + first + " " + op + " " + second + " = " + (divide( first , second )));
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