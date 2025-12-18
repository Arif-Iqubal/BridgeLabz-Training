 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsSpring and checking whether the given month is spring or not
public class IsSpring{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking details of month and day
	System.out.println("Enter the month in number : ");
	int month = input.nextInt();
	System.out.println("Enter the day in number : ");
	int day = input.nextInt();
	
	// Checking and displaying whether the given date is spring or not
	if((month >= 3  && day >= 20 ) || ((month <= 6 && day <= 20))){
		System.out.println("Its a spring season ");
		
	}
	else{
		System.out.println("Its not a spring season ");
		
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 