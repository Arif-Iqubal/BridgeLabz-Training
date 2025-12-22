// Program to compare two strings are equal or not
import java.util.Scanner;
class CompareString {
  // Method to compare strings are equal to not
  public static boolean compareString(String text1, String text2) {
  
    int text1Length = text1.length();
	int text2Length = text2.length();
	
	if(text1Length != text2Length ){
		return false;
	}
    for (int i = 0; i < text1Length; i++) {
        if (text1.charAt(i) != text2.charAt(i)) {
            return false;
        }
    }
	return true;

   
  }
  public static void main(String[] args) {
    // Take user input for two Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter first text: ");
    String text1 = sc.nextLine().trim();
    System.out.print("Enter second text: ");
    String text2 = sc.nextLine().trim();

    // Checking the strings are equal or not
    boolean areEqual  = CompareString.compareString(text1,text2);
	
	//Comparing string using built-in methods
	
	boolean areEqualBuiltIn = text1.equals(text2);

    // Display the result
	if(areEqual == areEqualBuiltIn){
		if(areEqual){
			System.out.println("The string " + text1 + " and " + text2 + " are same");
		}
		else{
			System.out.println("The string " + text1 + " and " + text2 + " are not same");

		}
	}
	else{
		System.out.println("The string " + text1 + " and " + text2 + " are not same");
	}

  }
}
