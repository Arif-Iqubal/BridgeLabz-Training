//importing Scanner class from java.util package
import java.util.Scanner;



//Creating a class name PriceCalucaltion to calculation price of given item

public class PriceCalucaltion{

	public static void main(String[] args){
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking item details as input
	System.out.println("Enter the quantity of item : ");
	int quantity = input.nextInt();
		System.out.println("Enter the price of item : ");
	int unitPrice = input.nextInt();
	
	// Calculating the total price of item
	double totalPrice = unitPrice * quantity ;
	
	

	
	// Display the total price of item
	System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice );
	
	//close the Scanner object
	input.close();
	
	
	}




} 