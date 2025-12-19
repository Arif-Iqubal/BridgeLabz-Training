//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name TallestAndYoungest and displaying the youngest and tallest friend among them
public class TallestAndYoungest{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	//user names
	String name_1 = "Amar";
	String name_2 = "Akbar";
	String name_3 = "Anthony";
	
	//Declaring two 1D array
	int[] age = new int[3];
	int[] height = new int[3];
	
	
	// Taking user details as input
	System.out.println("Enter age of Amar : ");
	 age[0] = input.nextInt();
	System.out.println("Enter height of Amar in centimeters : ");
	 height[0] = input.nextInt();
	System.out.println("Enter age of Akbar : ");
	 age[1] = input.nextInt();
	System.out.println("Enter height of Akbar in centimeters : ");
	 height[1] = input.nextInt();
	System.out.println("Enter age of Anthony : ");
	 age[2] = input.nextInt();
	System.out.println("Enter height of Anthony in centimeters : ");
	 height[2] = input.nextInt();

	//checking the youngest and tallest friend
	int smallest = 0;
	int tallest = 0;
	int max = Integer.MAX_VALUE;
	int min = Integer.MIN_VALUE;
	for(int i = 0 ; i < 3 ; i++){
		if(age[i]<max){
			max = age[i];
			smallest = (i+1);
		}
		
	}
	for(int i = 0 ; i < 3 ; i++){
		if(height[i]>min){
			min = height[i];
			tallest = (i+1);
		}
		
	}
	
	//Displaying the youngest and tallest friend
	if(smallest == 1 ){
		System.out.println("The youngest friend is " + name_1);
	}
	else if(smallest == 2 ){
		System.out.println("The youngest friend is " + name_2);
	}
	else{
		System.out.println("The youngest friend is " + name_3);
	}
	
	if(tallest == 1 ){
		System.out.println("The tallest friend is " + name_1);
	}
	else if(tallest == 2 ){
		System.out.println("The tallest friend is " + name_2);
	}
	else{
		System.out.println("The tallest friend is " + name_3);
	}
	


	//close the Scanner object
	input.close();
	
	
	
	}




} 