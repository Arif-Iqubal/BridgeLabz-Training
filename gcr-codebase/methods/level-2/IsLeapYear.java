//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsLeapYear and calculate and display whether the year is leap or not
public class IsLeapYear{
	
	//Creating a method to check is year is leap year or not
	public static boolean leapYear( int year){
		//checking the year is greater than 1581 or not
	if(year >= 1582){

		// checking the year is a leap year or not
		if( year % 4 == 0){
			if( year % 100 == 0){
				if( year % 400 == 0){
					return true;
				}
				else{
					return false;

				}
			}
			else{
				return true;
				
			}
		
		}
		else{
			return false;
			
		}
			
	}
	else{
		System.out.println("The year " + year + " is lower than 1582 ");
		return false;
		
	}
	}
	
	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for year
	System.out.println("Enter a year : ");
	int year = input.nextInt();
	
	//Calling method to check the year is leap or not
	boolean isleap = IsLeapYear.leapYear(year);
	
	//Displaying the year is leap or not
	if(isleap){
		System.out.println("The year " + year + " is a leap year");

	}
	else{
		System.out.println("The year " + year + " is not a leap year");

	}
	
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 