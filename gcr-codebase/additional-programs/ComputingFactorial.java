//program to compute the factorial of number
import java.util.Scanner;
public class ComputingFactorial{
	//Method to take input
	public static int takeInput(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to compute the factorial");
		int number = input.nextInt();
		
		input.close();
		
		return number;
		
	}
	//Method to compute the factorial of number
	public static int computeFactorial(int number){
		if(number == 1){
			return 1;
		}
		return number * computeFactorial(number-1);
		
	}

	public static void main(String[] args){
		
		//Method to take input and compute the fibonacciSequence
		int number=ComputingFactorial.takeInput();
		
		//Computing and displaying the factorial of number
		int factorial = ComputingFactorial.computeFactorial(number);
		System.out.println("The factorial of number " + number + " is " + factorial);
		
		
	}
}