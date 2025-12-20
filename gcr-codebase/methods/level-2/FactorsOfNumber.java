// Create FactorsOfNumber Class to compute the factor of the given number 
import java.util.Scanner;

//Created a class FactorsOfNumber to compute the factors of the number 
public class FactorsOfNumber {

	//computing the factors
	public static int[] factorsOfNumbers (int number){
		// Declare 1D Array
		int maxFactor = 10;
		int index = 0;
		int[] arr = new int[maxFactor];
		

		// computing the factor of given number
		int tempFactor = 0;
		for(int i = 1 ; i <= number ; i++ ){
			if(number % i == 0){
				
				if(index == maxFactor){
					maxFactor = maxFactor * 2;
					int[] temp = new int[maxFactor]; 	//creating temp array
					for(int j =0; j<index ; j++){      	//copying old elements to new array
						
						temp[j] = arr[j];        		//assign new array
					}
					arr = temp ;
					
					
				}
				
				
				arr[index] = i;
				index++;
			}
			  
		}
		
		
		return arr;
	}

	//computing the sum of all factors
	public static int sumOfFactors(int[] arr){
		int sum = 0;
		int arraysize = arr.length;
		for(int i =0;i<arraysize;i++){
			sum += arr[i];
		}
		return sum;
	}


	//computing the sum of square all factors
	public static int sumOfSquaresFactors(int[] arr){
		int sumOfSquares = 0;
		int arraysize = arr.length;
		for(int i =0;i<arraysize;i++){
			int temp = 2;
			int power = arr[i] * arr[i];
			sumOfSquares += power;
		}
		return sumOfSquares;
	}


	//computing the product of all factors
	public static int productOfFactors(int[] arr){
		int product = 1;
		int arraysize = arr.length;
		for(int i =0;i<arraysize;i++){
			if(arr[i]==0){
				break;
			}
			product *= arr[i];
		}
		return product;
	}


   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	
	
    // Take input from the user for a number
	System.out.print("Enter a number : ");
	int number = input.nextInt();
	
	//calling the methods
	int factor[] = FactorsOfNumber.factorsOfNumbers(number);
	int sum = FactorsOfNumber.sumOfFactors(factor);
	int product = FactorsOfNumber.productOfFactors(factor);
	int squareSum = FactorsOfNumber.sumOfSquaresFactors(factor);
	
	
	//Displaying the factors, sum of factor, sum of squares of factor and product of factors
	System.out.println("The factors of the number " + number + " are : ");
	int index = factor.length;
	for(int i = 0 ; i < index ; i++){
		if(factor[i]==0){
				break;
		}
		System.out.print(factor[i] + " ");
	}
		
	System.out.println("The sum of factors of the number " + number + " is : " + sum);
	System.out.println("The sum of the squares of factors of the number " + number + " is : " + squareSum);
	System.out.println("The product of the factors of the number " + number + " is : " + product);
	


      // Close the Scanner Object
      input.close();
   }
}
