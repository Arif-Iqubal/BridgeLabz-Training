// Program to compare two string array 
import java.util.Scanner;
public class CompareTwoStringArray {
  // Method to computing string array
  public static char[] getStringArray(String text) {
	  
	int arrayLength = text.length();
    char[] stringArray = new char[arrayLength];
	for(int i = 0 ; i< arrayLength ; i++){
		stringArray[i] = text.charAt(i);
		
	}
	return stringArray;

   
  }
  //Comparing both string arrays
  public static boolean areSame(char[] arr1, char[] arr2){
	  int arrayLength = arr1.length;
	  for(int i=0;i<arrayLength;i++){
		  char text1 = arr1[i];
		  char text2 = arr2[i];
		  if(text1 != text2){
			  return false;
		  }
	  }
	  return true;
  }
 
  
  public static void main(String[] args) {
    // Take user input for two Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
 

    // Computing the string array
    char[] result1  = CompareTwoStringArray.getStringArray(text);
	
	//Computing string array using build in method
	char[] result2 = text.toCharArray();
	
	//Comparing both sub Stringsabbuzar982@gmail.com
	boolean areSameStringArray = CompareTwoStringArray.areSame(result1,result2);

    // Display the result
	if(areSameStringArray){
		System.out.println("The string array are same ");
		for(int i=0;i<result1.length;i++){
			System.out.print(" " + result1[i]);
		}
	
	}
	else{
		System.out.println("The String array are not same");
	}
	
	sc.close();
  }
}
