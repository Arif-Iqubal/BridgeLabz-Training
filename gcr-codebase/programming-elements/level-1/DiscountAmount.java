//Creating a class name DiscountAmount and displaying the discounted amount to pay fees

public class DiscountAmount{

	public static void main(String[] args){
	
	// Creating a integer variable and storing the fees to pay
	int fee = 125000;
	
	// Creating a integer variable and storing the discount percentage
	int discountPercentage = 10;
	
	
	
	
	//Calulating the discount amount
	int discount = (fee * 10) / 100 ;
	
	//Calulating the discount amount
	int discountedFee = fee - discount ;
	
	// displaying the dicount amount and discounted fee
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	
	
	
	
	
	}




} 