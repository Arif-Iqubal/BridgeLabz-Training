//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name BonusAmount and displaying the bonus amount of employee based on their year of service
public class BonusAmount{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for employee detail
	System.out.println("Enter the employee salary : ");
	int salary = input.nextInt();
	System.out.println("Enter the employee year of service : ");
	int yearOfService = input.nextInt();
	int bonus = 0 ;
	
	// Checking and calculating the bonus amount based on the year of servie
	if(yearOfService > 5){ 
		
		 bonus = ( salary * 5 ) / 100 ;
			
		}
	System.out.println("The bonus amount base on the " + yearOfService + " year of service is " + bonus);

	//close the Scanner object
	input.close();
	
	
	
	}




} 