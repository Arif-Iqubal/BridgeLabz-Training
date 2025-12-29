//Program to simulate the phone recharge operations
//importing Scanner class from java.util package
import java.util.Scanner;

//Create MobileRecharge class to simulate mobile recharge operations
public class MobileRecharge{
	
	//Method to show Jio plans
	public static void displayPlan1(){
		System.out.println("Price\tvalidity\tplan");
		System.out.println("149\t28 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("199\t60 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("399\t80 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("499\t90 days\t\tunlimited call, 2 Gb/d");
	}
	
	//Method to show Airtel plans
	public static void displayPlan2(){
		System.out.println("Price\tvalidity\tplan");
		System.out.println("149\t28 days\t\tunlimited call, 1.0 Gb/d");
		System.out.println("199\t60 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("499\t80 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("599\t90 days\t\tunlimited call, 2 Gb/d");
	}
	
	//Method to show Bsnl plans
	public static void displayPlan3(){
		System.out.println("Price\tvalidity\tplan");
		System.out.println("99\t28 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("149\t60 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("349\t80 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("499\t180 days\t\tunlimited call, 2 Gb/d");
	}
	
	//Method to show Vi plans
	public static void displayPlan4(){
		System.out.println("Price\tvalidity\tplan");
		System.out.println("149\t28 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("199\t60 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("399\t80 days\t\tunlimited call, 1.5 Gb/d");
		System.out.println("499\t90 days\t\tunlimited call, 2 Gb/d");
	}
	public static void main(String[] args){
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Looping to perform Mobile recharge operations
		int balance = 1000;
		while(balance!=0){
			//Taking user input for mobile operator and amount
			System.out.println("\nChoose your mobile operator");
			System.out.println("1 => Jio");
			System.out.println("2 => Airtel");
			System.out.println("3 => Bsnl");
			System.out.println("4 => Vi");
			int operator = input.nextInt();
			switch(operator){
				case 1:{
					MobileRecharge.displayPlan1();
					break;
				}
				case 2:{
					MobileRecharge.displayPlan2();
					break;
				}
				case 3:{
					MobileRecharge.displayPlan3();
					break;
				}
				case 4:{
					MobileRecharge.displayPlan4();
					break;
				}
				
				
			}
			System.out.println("Enter Balance to recharge");
			int amount = input.nextInt();
			String continueRecharge = new String();
			//Performing recharge
		
			if((balance-amount) < 0){
				System.out.println("Insufficient Balance " + balance);
			}
			else{
				balance -= amount;
				System.out.println("Recharge Successfully");
				System.out.println("Remaining Balance " + balance);
				System.out.println("Enter exit or continue");
				continueRecharge = input.nextLine();
			}
			if(continueRecharge.equals("exit")){
				break;
			}
			
			
		}
		
		
		
		
		
		input.close();
	
	}
}