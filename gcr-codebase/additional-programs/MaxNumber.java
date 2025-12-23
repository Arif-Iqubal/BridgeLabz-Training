//program to compute maximum of three numbers
import java.util.Scanner;
public class MaxNumber{
	//Method to take input
	public static int[] takeInput(){
		Scanner input = new Scanner(System.in);
		int arr[] = new int[3];
		System.out.println("Enter first number");
		arr[0] = input.nextInt();
		System.out.println("Enter second number");
		arr[1] = input.nextInt();
		System.out.println("Enter third number");
		arr[2] = input.nextInt();
		
		
		input.close();
		
		return arr;
		
	}
	//Method to compute maximum
	public static int computeMaximum(int[] arr){
		if(arr[0]>arr[1] && arr[0]> arr[2]){
			return arr[0];
		}
		else if(arr[1]>arr[0] && arr[1]> arr[2]){
			return arr[1];
		}
		else{
			return arr[2];
		}
	}

	public static void main(String[] args){
		
		//Method to take input and compute the maximum number
		int arr[]=MaxNumber.takeInput();
		
		//Mehtod to compute maximum number
		int max = MaxNumber.computeMaximum(arr);
		
		//Displaying the max number
		System.out.println("The maximum number amomg " + arr[0] + "," + arr[1] + " and " + arr[2] + " is " + max);
	
	}
}