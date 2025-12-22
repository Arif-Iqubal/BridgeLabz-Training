// Program to ArrayIndexOutOfBoundsException
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {
  // Method to generate a index out of bond exceptions
  public static void generateException(int[] arr) {
	 int arrayLength = arr.length;
	for(int i =0;i<=arrayLength;i++){
		System.out.print(" "+arr[i] );
	}
	
  }
  //Handling index out of bond exceptions
  public static void handleException(int[] arr){
	  try{
		int arrayLength = arr.length;
		for(int i =0;i<=arrayLength;i++){
			System.out.println(" "+arr[i] );
		}
	}
	   catch (Exception e){
		  System.out.print("ArrayIndexOutOfBoundsException handles  => " + e.getMessage());
	  }
	 
  }
 
  
  public static void main(String[] args) {
	//Taking user input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a the lenght of array: ");
	int arrayLength = input.nextInt();
	int arr[] = new int[arrayLength];
	System.out.println("Enter a the values of array: ");
	for(int i =0;i<arrayLength;i++){
		arr[i] = input.nextInt();
	}
	
	
	//handling exception
	ArrayIndexOutOfBoundsException.handleException(arr);
	
	//Method to generate exception
	ArrayIndexOutOfBoundsException.generateException(arr);
	
	
	
	input.close();

	}
}
