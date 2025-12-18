//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name DayOfMonth and Calculating day of month
public class DayOfMonth{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for date 
	System.out.println("Enter the year : ");
	int year = input.nextInt();
	System.out.println("Enter the month : ");
	int month = input.nextInt();
	System.out.println("Enter the day : ");
	int day = input.nextInt();
	
	//calulating day of month
	
	int yearCalulation = year - (14 - month) / 12;
	int temp = yearCalulation + (yearCalulation / 4) - (yearCalulation / 100) + (yearCalulation / 400);
	int monthCalculation = month + 12 * ((14 - month) / 12) - 2;
	int dayCalculation = (day + temp + ((31 * monthCalculation) / 12)) % 7;
	
	switch(dayCalculation){
		case 0:
		{
		System.out.println("The day of week is Sunday");
			break;
		}
		case 1:
		{
		System.out.println("The day of week is Monday");
			break;
		}
		case 2:
		{
		System.out.println("The day of week is Tuesday");
			break;
		}
		case 3:
		{
		System.out.println("The day of week is Wednesday");
			break;
		}
		case 4:
		{
		System.out.println("The day of week is Thursday");
			break;
		}
		case 5:
		{
		System.out.println("The day of week is Friday");
			break;
		}
		case 6:
		{
		System.out.println("The day of week is Saturday");
			break;
		}
		default :
		{
		System.out.println("Wrong day number " + dayCalculation);
			break;
		}
		
		
	}
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 