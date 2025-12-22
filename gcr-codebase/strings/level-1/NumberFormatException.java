// Program to handle Number Format Exception
import java.util.Scanner;
public class NumberFormatException {
  // Method to generate a index out of bond exceptions
  public static void generateException(String text) {
	
	Integer.parseInt(text) ;
	
  }
  //Handling index out of bond exceptions
  public static void handleException(String text){
	  try{
		Integer.parseInt(text) ;
	}
	   catch (Exception e){
		  System.out.println("NumberFormatException handles  => " + e.getMessage());
	  }
	 
  }
 
  
  public static void main(String[] args) {
	//Taking user input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String text = input.nextLine();
	
	//handling exception
	NumberFormatException.handleException(text);
	
	//Method to generate exception
	NumberFormatException.generateException(text);
	
	
	
	input.close();

	}
}
