//Program to compute total and average push-ups in a week by Sandeep's
//importing Scanner class from java.util package
import java.util.Scanner;

public class FitnessTracker{
	//Method to compute average of push-ups
	public static double averagepushUps(int[] pushUps, int totaldays){
		int length = pushUps.length;
		double average = 0;
		int sum = 0;
		for(int i=0;i<length;i++){
			if(pushUps[i] != -1){
				sum += pushUps[i];
			}
			
		}
		average = sum / (double)totaldays;
		return average;
	}

	//Method to compute maximum pushUps
	public static int maxpushUps(int[] pushUps){
		int length = pushUps.length;
		int maximumpushUps = pushUps[0];
		
		for(int i=1;i<length;i++){
			if(maximumpushUps < pushUps[i]){
				maximumpushUps = pushUps[i];
			}
		}
		
		return maximumpushUps;
	}
	
	//Method to display pushUps
	public static void displaypushUps(String[] week,int[] pushUps){
		System.out.println("Last week pushUps overview");
		System.out.println("-----------------------------------------");
		System.out.println("Day\t\t\tPush-ups");
		for(int i =0; i<7;i++){
			if(pushUps[i] != -1){
				System.out.println(week[i]+"\t\t"+pushUps[i]);
			}
			else{
				System.out.println(week[i]+"\t\tRest Day");
			}
		}
	}
	
	
	public static void main(String[] args){
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Initializing days in a week
		String[] week = {"Sunday   ","Monday   ","Tuesday   ","Wednesday","Thrusday","Friday   ","Saturday"};
		
		//Taking user input for pushUps
		int [] pushUps = new int[7];
		int totaldays =0;
		for(int i =0; i<7;i++){
			System.out.println("----------------------------------------------------");
			System.out.println(" For skip day Enter -1 ");
			System.out.println("----------------------------------------------------");
			System.out.println( week[i] + " : Enter number of Push-Ups done today ");
			pushUps[i] = input.nextInt();
			if(pushUps[i] != -1){
				totaldays++;
			}
		
		}
		
		//Calling methods to compute average and max pushUps
		double average = FitnessTracker.averagepushUps(pushUps,totaldays);
		int maximum = FitnessTracker.maxpushUps(pushUps);
		
		//Displaying result
		System.out.println("-----------------------------------------");
		FitnessTracker.displaypushUps(week,pushUps);
		System.out.println("-----------------------------------------");
		System.out.println("Maximum pushUps in this week is "+ maximum);
		System.out.println("-----------------------------------------");
		System.out.println("Average pushUps in this week is "+ average);
		System.out.println("-----------------------------------------");
		
		
		
		input.close();
	}
}