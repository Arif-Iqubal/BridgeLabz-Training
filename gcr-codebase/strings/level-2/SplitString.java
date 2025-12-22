// Program to split the string
import java.util.Scanner;
public class SplitString{
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
  
  //Method to split strings
  public static String[] spiliting(String text , int length){
	int wordCount = 0;
	int spaceCount = 0;
	int[] space = new int[length];
		for(int i=0;i<length-1;i++){
			if((text.charAt(i)!= text.charAt(i+1)) && (text.charAt(i) == ' ')){
				space[i] = -1;
				spaceCount++;
			}
		}
	wordCount = spaceCount + 1;
	String[] word = new String[wordCount];
		int index = 0;
		String temp = "";
		for(int j = 0; j< length;j++){
			if(space[j]!=-1){
				temp += text.charAt(j);
			}
			else{
				word[index] = temp;
				index++;
				temp ="";
			}
			
			
		}
		word[index] = temp;
		
		return word;
	
  }
  //Method to compare userdefined and build-in result
	public static boolean areSame(String[] text1, String[] text2){
		int length1 = text1.length;
		int length2 = text2.length;
		if(length1!=length2){
			return false;
		}
		for(int i =0; i<length1;i++){
			String temp1 = text1[i];
			String temp2 = text2[i];
			if(!temp1.equals(temp2)){
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
 

    // Computing the length of string
    int textLength  = LengthOfString.findLength(text);
	
	//Method to split the string user defined
	String[] split = SplitString.spiliting(text,textLength);
	
	//Method to split the string build-in
	String[] splitBuildIN = text.split(" ");
 
	//Method to compare userdefine and built in split method
	boolean areSameSplit = SplitString.areSame(split,splitBuildIN);
    // Display the result
	
	if(areSameSplit){
		System.out.println("\nBoth user defined and built-in result are same");
	}
	else{
		System.out.println("\nBoth user defined and built-in result are not same");

	}
	System.out.println("\nShowing user defined split method result");
	for(int i=0;i<split.length;i++){
		System.out.print(" "+ split[i]);
	}
	System.out.println("\n\nShowing build-in split method result");
	for(int i=0;i<splitBuildIN.length;i++){
		System.out.print(" "+ splitBuildIN[i]);
	}
		
	sc.close();
  }
}
