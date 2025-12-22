// Program to split the string
import java.util.Scanner;
public class SplitString2D{
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
  public static String[][] spiliting(String text , int length){
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
	String[][] word = new String[wordCount][2];
	int wordLength = 0;
		int index = 0;
		String temp = "";
		for(int j = 0; j< length;j++){
			if(space[j]!=-1){
				temp += text.charAt(j);
				wordLength++;
			}
			else{
				word[index][0] = temp;
				word[index][1] = String.valueOf(wordLength);
				wordLength=0;
				index++;
				temp ="";
			}
			
			
		}
		word[index][0] = temp;
		word[index][1] = String.valueOf(wordLength);

		
		return word;
	
  }

 
  
  public static void main(String[] args) {
    // Take user input for Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
 

    // Computing the length of string
    int textLength  = SplitString2D.findLength(text);
	
	//Method to split the string user defined
	String[][] split = SplitString2D.spiliting(text,textLength);
	

    // Display the result
	
	System.out.println("\nShowing user defined split method result ");
		System.out.println("\n\tWord\tLength ");

	
	for(int i=0;i<split.length;i++){
			System.out.println("\t"+ split[i][0]+"\t"+ Integer.parseInt(split[i][1]));
		
	}
		
	sc.close();
  }
}
