// Program to handle illegak argument exception
import java.util.Scanner;
public class IllegalArgumentException {
  // Method to generate a index out of bond exceptions
  public static void generateException(String text) {
	
	text.substring(2,1);
	
  }
  //Handling index out of bond exceptions
  public static void handleException(String text){
	  try{
		text.substring(2,1);
	}
	   catch (Exception e){
		  System.out.println("IllegalArgumentException handles  => " + e.getMessage());
	  }
	 
  }
 
  
  public static void main(String[] args) {
	//Taking user input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String text = input.nextLine();
	
	//handling exception
	IllegalArgumentException.handleException(text);
	
	//Method to generate exception
	IllegalArgumentException.generateException(text);
	
	
	
	input.close();

	}
}
