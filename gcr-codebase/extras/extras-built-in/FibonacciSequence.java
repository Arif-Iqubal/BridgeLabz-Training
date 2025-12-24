//program to compute fibonacci sequence
import java.util.Scanner;
public class FibonacciSequence{
	//Method to take input
	public static int takeInput(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to generate fibonacci sequence");
		int number = input.nextInt();
		
		input.close();
		
		return number;
		
	}
	//Method to generate fibonacci sequences
	public static void generateFibonacci(int number){
		int prev = 0;
		int curr = 1;
		System.out.print(prev + " ");
		for(int i =0;i<number-1;i++){
			System.out.print(curr + " ");
			int temp = curr;
			curr = curr + prev;
			prev = temp;
			
		}
		
	}

	public static void main(String[] args){
		
		//Method to take input and compute the fibonacciSequence
		int number=FibonacciSequence.takeInput();
		
		//Computing and displaying the fibonacci sequence
		FibonacciSequence.generateFibonacci(number);
		
		
	}
}