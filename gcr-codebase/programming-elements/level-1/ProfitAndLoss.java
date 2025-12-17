//Creating a class name ProfitAndLoss and displaying profit or loss in number and percentage

public class ProfitAndLoss{

	public static void main(String[] args){
	
	// Creating a double variable and storing the cost price
	double costPrice = 129;
	
	// Creating a double variable and storing the selling price
	double sellingPrice = 191;
	
	
	//cost price is lower than selling price so we are calculating profit
	
	//Calulating  profit in numbers
	double profit = sellingPrice - costPrice ;
	
	//Calulating  profit in percentage
	double profitPercentage = ( profit / costPrice ) * 100 ;
	
	// displaying costPrice and sellingPrice
	System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
	
	// displaying costPrice and sellingPrice
	System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	
	
	
	}




} 