 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name ChocolatesDistribution and compute the remainder and quotient of chocolate
public class ChocolatesDistribution{
	
	
	// computing the remainder and quotient of number
	public static int[] findChocolatesDistribution(int number, int divisor) {
		int[] result = new int[2];
		result[0] = number % divisor;
		result[1] = number / divisor;
		
		return result;
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter number of chocolates : ");
	int numberOfChocolates = input.nextInt();
	System.out.println("Enter number of children : ");
	int numberOfChildrens = input.nextInt();
	
	

	
	//Calling the FindChocolatesDistribution method to compute the reminder and quotient of chocolates
	
	int[] result = ChocolatesDistribution.findChocolatesDistribution(numberOfChocolates, numberOfChildrens);
	
	//displaying the smallest and largest number
	System.out.println("The chocolates " + numberOfChocolates + " distributed among " + numberOfChocolates + " students, each got " + result[1] + " chocolates and " + result[0] + " chocolates remains.");
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 