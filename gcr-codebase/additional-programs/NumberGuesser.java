//program to guessing the number
import java.util.Scanner;
public class NumberGuesser{
	
	public static void main (String[] args){
		//guessing number of user from 1 to 100
		int start = 1;
		int end = 100;
		Scanner input = new Scanner(System.in);
		//While loop to guess number from 1 to 100;
		while(start <= end){
			int mid = (start + end)/2; //computing the mid value
			System.out.println(mid + " is this your number \n Enter yes, higher or lower");
			String ans = input.nextLine();
			if(ans.equals("yes")){
				System.out.println("Found your number " + mid);
				break;
			}
			else if(ans.equals("higher")){
				start = mid+1;
				end--;
				
			}
			else{
				start++;
				end = mid-1;
			}
			
			
		}
		if(start>end){
				System.out.println("Found your number " + start);
			}
		
		input.close();
	}
	
}