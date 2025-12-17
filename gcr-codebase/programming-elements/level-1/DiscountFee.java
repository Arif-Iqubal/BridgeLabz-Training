//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name DiscountFee and displaying the discounted amount to pay fees

public class DiscountFee{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to input fees to be paid
	System.out.println("Enter the fee : ");
	
	// Creating a variable double and storing the user input distance in kilometer
	int fee = input.nextInt();
	
	
	// Displaying message to user, to enter the discount percentage
	System.out.println("Enter the fee : ");
	
	// Creating a variable double and storing the user input distance in kilometer
	int discountPercentage = input.nextInt();
	


	
	
	
	
	//Calulating the discount amount
	int discount = (fee * 10) / 100 ;
	
	//Calulating the discount amount
	int discountedFee = fee - discount ;
	
	// displaying the dicount amount and discounted fee
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 