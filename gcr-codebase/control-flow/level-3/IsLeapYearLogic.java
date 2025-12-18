//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsLeapYearLogic and calculate and display whether the year is leap or not
public class IsLeapYearLogic{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for year
	System.out.println("Enter a year : ");
	int year = input.nextInt();
	
	//checking the year is greater than 1581 or not
	if(year >= 1582){

		// checking the year is a leap year or not
		if( (year % 4 == 0) && (( year % 100 != 0) || ( year % 400 == 0))){
		
			System.out.println("The year " + year + " is a leap year");
				
		
		}
		else{
			System.out.println("The year " + year + " is not a leap year");
		}
			
	}
	else{
		System.out.println("The year " + year + " is lower than 1582 ");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 