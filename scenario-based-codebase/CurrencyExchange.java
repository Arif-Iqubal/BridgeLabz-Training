//Program to conver currency from Rupees to other currencys
//Importing Scanner class from java.util package
import java.util.Scanner;
public class CurrencyExchange{
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Looping and Taking user input to exhange currency
		do{
			System.out.println("----------------------");
			System.out.println("Currency Converter");
			System.out.println("----------------------");
			System.out.println("Enter amount in rupees");
			System.out.println("----------------------");
			double amount = input.nextDouble();
			System.out.println("Choose currency to conver");
			System.out.println("1 -> USD\n2 -> EUR\n3 -> GBP\n4 -> JPY\n5 -> CAD\n");
			System.out.println("----------------------");
			int temp = input.nextInt();
			System.out.println("----------------------------------------");
			switch(temp){
				case 1 ->{
					System.out.println(amount + " Rupees exhanged into " +(amount * 89.88) + " USD");
				}
				case 2 ->{
					System.out.println(amount + " Rupees exhanged into " +(amount * 89.88) + " Euro");
				}
				case 3 ->{
					System.out.println(amount + " Rupees exhanged into " +(amount * 89.88) + " Pound");
				}
				case 4 ->{
					System.out.println(amount + " Rupees exhanged into " +(amount * 89.88) + " Yen");
				}
				case 5 ->{
					System.out.println(amount + " Rupees exhanged into " +(amount * 89.88) + " Canadian Dollar");
				}
				default ->{
					System.out.println("Invalid Input");
				}
			}
			System.out.println("------------------------------------------\n\n");
			System.out.println("Enter \n1 -> Continue\n2 -> Exit");
			int exit = input.nextInt();
			if(exit == 2){
				break;
			}
			
		}while(true);
		
		input.close();
	}
}