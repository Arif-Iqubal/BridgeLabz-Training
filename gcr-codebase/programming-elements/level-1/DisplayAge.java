//Creating a class name DisplayAge to display harry's age in 2024

public class DisplayAge{

	public static void main(String[] args){
	// Creating a variable string and initializing it as Harry
	String name = "Harry";
	
	// Creating a variable integer and initializing it as current year-> 2024
	int currentYear = 2024;
	
	// Creating a constant variable integer and initializing it as harry birth year
	final int birthYear = 2000;
	
	// calculating harry's age in year 2024
	int age = currentYear - birthYear;
	
	// Display the age of harry
	System.out.println(""+name +"'s age in 2024 is " + age);
	
	
	}




} 