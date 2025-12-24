//program to compute the factorial of number
import java.util.Scanner;
public class LcmAndGcd{
	//Method to take input
	public static int[] takeInput(){
		Scanner input = new Scanner(System.in);
		int[] number = new int[2];
		System.out.println("Enter a first number");
		number[0] = input.nextInt();
		System.out.println("Enter a second number");
		number[1] = input.nextInt();
		
		
		input.close();
		
		return number;
		
	}
	//Method to compute GCD
	public static int computeGcd(int[] number){
		int gcd = 1;
		int min = 0;
		int max = 0;
		if(number[0]<number[1]){
			min = number[0];
			max = number[1];
		}
		else{
			min = number[1];
			max = number[0];
		}
		for(int i = min ; i>1; i++){
			if((max % i == 0 ) && (min % i) == 0){
				return i;
			}
		}
		
		return gcd;
		
	}
	
	//Mehtod to compute LCM 
	public static int computeLcm(int[] number , int gcd ){
		int product = number[0] * number[1];
		int lcm = product / gcd;
		return lcm;
	}

	public static void main(String[] args){
		
		//Method to take input and compute the fibonacciSequence
		int[] number=LcmAndGcd.takeInput();
		
		//Computing the LCM and GCD
		int gcd = LcmAndGcd.computeGcd(number);
		int lcm = LcmAndGcd.computeLcm(number,gcd);
		
		//Displaying the lcm and gcd
		System.out.println("The GCD " + gcd + " and LCM " + lcm + " for number " + number[0] + " and " + number[1]);
		
		
	}
}