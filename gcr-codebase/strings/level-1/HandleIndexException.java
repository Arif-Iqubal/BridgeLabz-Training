// Program to handle index out of bond exception
import java.util.Scanner;
public class HandleIndexException {
  // Method to generate a index out of bond exceptions
  public static void generateException(String text) {
	
	for(int i = 0; i<= text.length() ; i++){
		System.out.print(text.charAt(i));
	}
	
  }
  //Handling index out of bond exceptions
  public static void handleException(String text){
	  try{
		for(int i = 0; i<= text.length() ; i++){
		System.out.print(text.charAt(i));
	}
	  } catch (Exception e){
		  System.out.println("Index out of bond Exception handles => " + e.getMessage());
	  }
	 
  }
 
  
  public static void main(String[] args) {
	//Taking user input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String text = input.nextLine();
	
	//handling exception
	HandleIndexException.handleException(text);
	
	//Method to generate exception
	HandleIndexException.generateException(text);
	
	
	
	input.close();

	}
}
