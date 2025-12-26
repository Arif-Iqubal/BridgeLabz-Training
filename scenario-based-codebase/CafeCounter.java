//Write a Java program that asks the user for the coffee type using switch,
 //accepts quantity, calculates the total bill using price multiplied by quantity,
 //adds GST using arithmetic operators, and continues serving customers using a while loop. 
 //The program should stop when the user types “exit”.
 
 //program to compute price of coffee
// importing Scanner class from java.util package
import java.util.Scanner;

// Create CafeCounter class
class CafeCounter {

    // Returning price of product
    public static double computePrice(int product, int qty, int type) {
       int price = product * qty;
	   double gst = CafeCounter.computeGst(price);
	   double finalPrice = price + gst;
	   return finalPrice;
    }
	
    // Returning gst of product
    public static double computeGst(int price) {
		double gst = (price * 18.0) / 100.0;
        return gst;
    }

    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		String isBuying = "yes";
		while(isBuying != "exit"){
			System.out.println("Want to purchase something enter 'yes' or 'exit' ");
			String temp = input.next();
			if(temp.equals("exit")){
				break;
			}
			else{
				
			}
			//Taking user input
			System.out.println("Choose your coffee ");
			System.out.println("Enter 1 for hot coffee price 300/-");
			System.out.println("Enter 2 for cold coffee price 350/- ");
			System.out.println("Enter 3 for normal coffee price 200/-");
			System.out.println("Enter 4 for chocolate coffee price 400/- ");
			System.out.println("Enter 5 for macha price 700/- ");
			int type = input.nextInt();
			int product;
			String productName = new String();
			switch(type){
				case 1:{
					product = 300;
					productName = "Hot Coffee";
					break;
				}
				case 2:{
					product = 350;
					productName = "Cold Coffee";
					break;
				}
				case 3:{
					product = 200;
					productName = "Normal Coffee";
					break;
				}
				case 4:{
					product = 400;
					productName = "Chocolate Coffee";
					break;
				}
				case 5:{
					product = 700;
					productName = "Macha";
					break;
				}default:{
					product = -1;
				}
				
			}
			if(product == -1){
				System.out.println("Invalid type enter ");
			}
			else{
			
				System.out.println("Enter quantity: ");
				int qty = input.nextInt();
				
				//Calling method to compute price and display
				double price = CafeCounter.computePrice(product,qty,type);
				System.out.println("Bill of " + qty + " " +productName+ " with gst is " + price);
			}
		}
		
    }
}
