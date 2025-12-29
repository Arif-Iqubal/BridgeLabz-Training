//program to guessing the number
import java.util.Scanner;
public class NumberGuesser{
	
	public static void main (String[] args){
		//guessing number of user from 1 to 100
		int start = 1;
		int end = 100;
		int mid = (start + end)/2; //computing the mid value
		Scanner input = new Scanner(System.in);
		int totalAtempts= 5;
		boolean isfound = false;
		
		//Asking player to guesss a number between 1 to 100
		System.out.println("Guess a number between 1 to 100 ");
		
		//Do-While loop to guess number from 1 to 100 in five attempts;
		do{
			if(totalAtempts == 1){
				System.out.println("\nLast attempt left");
			}
			else{
				System.out.println("\n" + totalAtempts + " attempts left");
			}
			if(totalAtempts != 0){
				//Giving options to choose and give hints
				System.out.println(mid + " : is this your number \n Enter \n 1 => Yes,\n 2 => Higher \n 3 => Lower");
				int ans = input.nextInt();
				
				//using switch case to perform user choosed operation
				switch(ans){
					case 1:{
						System.out.println("Found your number " + mid);
						isfound = true;
						break;
					}
					case 2:{
						start = mid+1;
						end--;
						totalAtempts--;
						break;
						
					}
					case 3:{
						start++;
						end = mid-1;
						totalAtempts--;
						break;
					}
					default:{
						System.out.println("Enter valid operation");
					}
				}
				mid = (start + end)/2;
				if(isfound){
					break;
				}
			}
			//Initializing boolean variable to check if attempts are left
			boolean canBreak = false;
			if(totalAtempts==0){
				System.out.println("IS your number => " + mid);
				System.out.println("Enter\n 1 => Yes\n 2=> No");
				int lastCheck = input.nextInt();
				switch(lastCheck){
					case 1:{
						System.out.println("Found your number " + mid);
						canBreak = true;
						break;
					}
					case 2:{
						System.out.println("Failed to guess number");
						canBreak = true;
						break;
					}
					default :{
						System.out.println("\n\nInvalid input");
					}
				}
				if(canBreak){
					break;
				}
				
				
				
			}
			
		}while(start <= end);
		
		//Checking at last time if the last value is the player number or not
		if(start>end && totalAtempts != 0){
				System.out.println("Found your number " + start);
			}
		
		input.close();
	}
	
}