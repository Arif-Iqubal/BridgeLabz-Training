//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name YoungestFriends and displaying the youngest and tallest friend among them
public class YoungestFriends{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	//user names
	String name_1 = "Amar";
	String name_2 = "Akbar";
	String name_3 = "Anthony";
	
	
	// Taking user deatils as input
	System.out.println("Enter age of Amar : ");
	int age_1 = input.nextInt();
	System.out.println("Enter height of Amar in centimeters : ");
	int height_1 = input.nextInt();
	System.out.println("Enter age of Akbar : ");
	int age_2 = input.nextInt();
	System.out.println("Enter height of Akbar in centimeters : ");
	int height_2 = input.nextInt();
	System.out.println("Enter age of Anthony : ");
	int age_3 = input.nextInt();
	System.out.println("Enter height of Anthony in centimeters : ");
	int height_3 = input.nextInt();

	//checking the smallest age friend
	if((age_1 < age_2) && (age_1 < age_3)){
		
		System.out.println("The youngest friend among " + name_1 + ", " + name_2 + ", and " + name_3 + " is " + name_1  );
		
	}
	else if((age_2 < age_1) && (age_2 < age_3)){
		
		System.out.println("The youngest friend among " + name_1 + ", " + name_2 + ", and " + name_3 + " is " + name_2  );
		
	}
	else {
		
		System.out.println("The youngest friend among " + name_1 + ", " + name_2 + ", and " + name_3 + " is " + name_3  );

		
	}
	
	//checking the tallest height friend
	if((height_1 > height_2) && (height_1 > height_3)){
		
		System.out.println("The tallest friend among " + name_1 + ", " + name_2 + ", and " + name_3 + " is " + name_1  );
		
	}
	else if((height_2 > height_1) && (height_2 > height_3)){
		
		System.out.println("The tallest friend among " + name_1 + ", " + name_2 + ", and " + name_3 + " is " + name_2  );
		
	}
	else {
		
		System.out.println("The tallest friend among " + name_1 + ", " + name_2 + ", and " + name_3 + " is " + name_3  );

		
	}


	//close the Scanner object
	input.close();
	
	
	
	}




} 