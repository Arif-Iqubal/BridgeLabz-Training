// Program to compute lower case to upper case
import java.util.Scanner;
public class ToUpperCase{
  // Method to computing lowercase to uppercase
  public static String toUpperCaseUserDefined(String text) {
	  
	int arrayLength = text.length();
	String tempString = "";
	for(int i = 0 ; i< arrayLength ; i++){
		int ascii = text.charAt(i);
		if(ascii >=97 && ascii <= 122){
			int temp = (ascii - 32);
			char upperCase =(char)temp ;
			tempString += upperCase;
		}else{
			tempString += text.charAt(i);
		}
		
	}
	
	return tempString;

   
  }
  //Comparing both strings
  public static boolean areSame(String text1, String text2){
	  int arrayLength = text1.length();
	  for(int i=0;i<arrayLength;i++){
		  char tempText1 = text1.charAt(i);
		  char tempText2 = text2.charAt(i);
		  if(tempText1 != tempText2){
			  return false;
		  }
	  }
	  return true;
  }
 
  
  public static void main(String[] args) {
    // Take user input for Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
 

    // Computing the string lowercase to uppercase using user defined method
    String result1  = ToUpperCase.toUpperCaseUserDefined(text);
	
    // Computing the string lowercase to uppercase using build-in method
	String result2 = text.toUpperCase();
	
	//Comparing both sub Strings
	boolean areSameString = ToUpperCase.areSame(result1,result2);

    // Display the result
	if(areSameString){
		System.out.println("The string "+ text +" in uppercase is " + result1 );
		
	
	}
	else{
		System.out.println("The user defined and build in method answer is not same ");
	}
	
	sc.close();
  }
}
