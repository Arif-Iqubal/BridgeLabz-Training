//Program to compute discount of form the shopkeeper 
//importing Scanner class from java.util package
import java.util.Scanner;

//Create DiscountDashboard class to compute discounton items
public class DiscountDashboard{

	//Method to compute and return the discount
	public static double computeDiscount(int totalPrice){
		double discountPercentage ;
		if(totalPrice<100){
			discountPercentage = 5;
			
		}else if(totalPrice < 500){
			discountPercentage = 15;
		}else if (totalPrice < 700){
			discountPercentage = 25;
		}else{
			discountPercentage = 30;
		}
		double discountedPrice = (totalPrice * discountPercentage) / 100.0;
		return discountedPrice;
	}
	public static void main(String[] args){
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter number of items");
		int numberOfItems = input.nextInt();
		
		//Looping for number of item price
		int totalPrice = 0;
		for(int i = 0; i< numberOfItems ; i++){
			System.out.println("Enter price of Item : " + (i+1));
			int temp = input.nextInt();
			totalPrice += temp;
		}
		
		//Calling method to compute discount
		double discount = DiscountDashboard.computeDiscount(totalPrice);
		
		//Dispaying result
		System.out.println("Total Price\tDiscount\tFinal Bill");
		System.out.println(totalPrice + "\t\t" + discount + "\t\t" + (totalPrice-discount));
		input.close();
	
	}
}