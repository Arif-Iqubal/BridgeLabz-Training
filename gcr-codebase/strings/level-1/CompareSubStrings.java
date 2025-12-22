// Program to compare sub strings are equal or not
import java.util.Scanner;
public class CompareSubString {
  // Method to find sub string
  public static String getSubString(String text, int start, int end) {
  
    String subString ="" ;
	int textLength = text.length();
	for(int i = start ; i<= end ; i++){
		char temp = text.charAt(i);
		subString += temp;
	}
	return subString;

   
  }
  
  //Computing subString using built-in method
  public static String getSubStringBuiltIn(String text, int start, int end){
	  
	  return text.substring(start,end+1);
  }
  
  //comparing both sub string
  public static boolean areSame(String sub1, String sub2){
	  return sub1.equals(sub2);
  }
  
  public static void main(String[] args) {
    // Take user input for two Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
    System.out.print("Enter starting index: ");
    int start = sc.nextInt();
	 System.out.print("Enter ending index: ");
    int end = sc.nextInt();

    // Computing the sub string 
    String result1  = CompareSubString.getSubString(text,start,end);
	
	//Computing sub string using build in method
	String result2 = CompareSubString.getSubStringBuiltIn(text, start, end);
	
	//Comparing both sub Strings
	boolean areSameSubString = CompareSubString.areSame(result1,result2);

    // Display the result
	if(areSameSubString){
    System.out.println("The sub string " + result1 + " of string " + text + " are same");
	
	}
	else{
		System.out.println("The sub string " + result1 + " and " + result2 + " are not same");
	}
	
	sc.close();
  }
}
