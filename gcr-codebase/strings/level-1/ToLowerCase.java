// Program to compute upper case to lower case
import java.util.Scanner;
public class ToLowerCase{
  // Method to computing uppercase to lowrcase
  public static String toLowerCaseUserDefined(String text) {
	  
	int arrayLength = text.length();
	String tempString = "";
	for(int i = 0 ; i< arrayLength ; i++){
		int ascii = text.charAt(i);
		if(ascii >=65 && ascii <= 90){
			int temp = (ascii + 32);
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
 

    // Computing the string uppercase to lowecase using user defined method
    String result1  = ToLowerCase.toLowerCaseUserDefined(text);
	
    // Computing the string uppercase to lowecase  using build-in method
	String result2 = text.toLowerCase();
	
	//Comparing both sub Strings
	boolean areSameString = ToLowerCase.areSame(result1,result2);

    // Display the result
	if(areSameString){
		System.out.println("The string "+ text +" in lowercase is " + result1 );
		
	
	}
	else{
		System.out.println("The user defined and build in method answer is not same ");
	}
	
	sc.close();
  }
}
