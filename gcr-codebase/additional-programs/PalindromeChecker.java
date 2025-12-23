//program to compute maximum of three numbers
import java.util.Scanner;
public class PalindromeChecker{
	//Method to take input
	public static String takeInput(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String text = input.nextLine();
		
		input.close();
		
		return text;
		
	}
	//Method to check palindrome
	public static boolean isPalindrome(String text){
		int start = 0;
		int end = text.length() - 1;
		char temp1 = text.charAt(start);
		char temp2 = text.charAt(end);
		while(start<=end){
			if(!(temp1==temp2)){
				return false;
			}
			start++;
			end--;
			
		}
		return true;
		
	}

	public static void main(String[] args){
		
		//Method to take input 
		String text=PalindromeChecker.takeInput();
		
		//Checking the string is palindrome or not
		boolean result = PalindromeChecker.isPalindrome(text);
		
		//Displaying the result
		if(result){
			System.out.println("The String is palindrome ");

		}
		else{
			System.out.println("The String is not palindrome");
		}
		
	}
}