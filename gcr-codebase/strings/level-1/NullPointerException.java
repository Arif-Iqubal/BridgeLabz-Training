// Program to handle null pointer exception
import java.util.Scanner;
public class NullPointerException {
  // Method to generate a null pointer exceptions
  public static void generateException(String text) {
	System.out.println("Generating null pointer exception" + text.length());  
	
  }
  //Handling Null Pointer exception
  public static void handleException(String text){
	  try{
		System.out.println(text.length());
	  } catch (Exception e){
		  System.out.println("Null Pointer Exception handles => " + e.getMessage());
	  }
	 
  }
 
  
  public static void main(String[] args) {
	//Creating a null pointer string
	String text = null;
	
	//Method to generate exception
	NullPointerException.generateException(text);
	
	//handling exception
	NullPointerException.handleException(text);

	}
}
