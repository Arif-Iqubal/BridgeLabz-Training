 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsSpring and checking whether the given month is spring or not
public class IsSpring{
	
	
	// computing the given date is spring or not
	public boolean computeSpring(int month , int day) {
		if((month >= 3  && day >= 20 ) || ((month <= 6 && day <= 20))){
			return true;
		
		}
		else{
			return false;
		
		}
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking details of month and day
	System.out.println("Enter the month in number : ");
	int month = input.nextInt();
	System.out.println("Enter the day in number : ");
	int day = input.nextInt();
	
	
	//creating class object
	IsSpring season = new IsSpring();
	
	//Calling the positiveOrnegativeOrzero method to return number sign
	
	boolean result = season.computeSpring(month , day);
	
	//displaying whether the given date is spring or not
	if(result){
		System.out.println("Its a Spring Season");
	}
	else{
		System.out.println("Not a Spring Season");
	}
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 