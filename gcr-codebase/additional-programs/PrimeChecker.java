//program to compute maximum of three numbers
import java.util.Scanner;
public class PrimeChecker{
	//Method to take input
	public static int takeInput(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		input.close();
		
		return number;
		
	}
	//Method to check number is prime or not
	public static boolean isPrime(int number){
		for(int i = 2; i< number ; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		
		//Method to take input and compute the maximum number
		int number=PrimeChecker.takeInput();
		
		//Mehtod to compute number is prime or not
		boolean result = PrimeChecker.isPrime(number);
		
		//Displaying the result
		if(result){
			System.out.println("The number " + number + " is prime number");

		}
		else{
			System.out.println("The number " + number + " is not prime number");
		}
	}
}