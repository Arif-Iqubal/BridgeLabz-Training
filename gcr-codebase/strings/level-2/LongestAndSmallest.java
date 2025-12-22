// Program to split the string and find the longest and smallest length of word
import java.util.Scanner;
public class LongestAndSmallest{
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
	String[][] word = new String[wordCount][3];
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
	word[0][2] = String.valueOf(wordCount);
	word[index][0] = temp;
	word[index][1] = String.valueOf(wordLength);

	
	return word;
	
  }
  //Method to compute longest and smallest word length in string
  public static int[] computeLongestAndSmallest(String[][] word){
	  int max = Integer.MAX_VALUE;
	  int min = Integer.MIN_VALUE;
	  int arraylength =Integer.parseInt(word[0][2]);
	  for(int i=0;i<arraylength;i++){
		  int tempLength = Integer.parseInt(word[i][1]);
		  if(tempLength>min){
			  min = tempLength;
		  }
		  if(tempLength<max){
			  max = tempLength;
		  }
	  }
	  int result[] = new int[2];
	  result[0] = min;
	  result[1] = max;
	  return result;
  }

 
  
  public static void main(String[] args) {
    // Take user input for Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
 

    // Computing the length of string
    int textLength  = LongestAndSmallest.findLength(text);
	
	//Method to split the string user defined
	String[][] split = LongestAndSmallest.spiliting(text,textLength);
	
	//Method to compute smallest and largest word length
	int stringLenght[] = LongestAndSmallest.computeLongestAndSmallest(split);
	
    // Display the result
	
	System.out.println("\nShowing user defined split method result ");
		System.out.println("\n\tWord\tLength ");

	
	for(int i=0;i<split.length;i++){
			System.out.println("\t"+ split[i][0]+"\t"+ Integer.parseInt(split[i][1]));
		
	}
	
	System.out.println("The smallest length is " + stringLenght[1] + " and the largest lenght is " + stringLenght[0]);
		
	sc.close();
  }
}
