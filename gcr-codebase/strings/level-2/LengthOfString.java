// Program to compute the length of string
import java.util.Scanner;
public class LengthOfString{
  // Method to computing uppercase to lowrcase
  public static int findLength(String text) {
	  
	int length = 0;
	int index =0;
	 while(true){
		 try{
			 char temp = text.charAt(index);
			 length++;
			 index++;
		 }catch(Exception e){
			 System.out.println("Found the length of string");
			 break;
		 }
	 }
	
	return length;

   
  }
 
  
  public static void main(String[] args) {
    // Take user input for Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
 

    // Computing the length of string
    int result1  = LengthOfString.findLength(text);
	
    // Computing the length of string using build-in method
	int result2 = text.length();


    // Display the result
	System.out.println("The length of string "+ text +" by user define is " + result1+" by build-in is " + result2 );
		
	sc.close();
  }
}
