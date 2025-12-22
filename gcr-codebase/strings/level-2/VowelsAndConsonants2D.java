// Program to compute vowels and consonents
import java.util.Scanner;
public class VowelsAndConsonants2D{
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
  //Compute vowels and consonents
  public static String[][] isVowelsAndConsonants(String text){
	 int length = text.length();
	 String result[][] = new String[length][2];
	 for(int i =0;i<length;i++){
		 char temp = text.charAt(i);
		 int ascii = temp;
		 if(ascii>= 97 && ascii<=122){
			 if((temp == 'a') || (temp == 'e')|| (temp == 'i') || (temp == 'o') || (temp == 'u')){
				 result[i][0] = String.valueOf(temp);
				 result[i][1] = "Vowel";
			 }
			 else{
				 result[i][0] = String.valueOf(temp);
				 result[i][1]="Consonant";
			 }
		 }
		 else{
			 result[i][0] = String.valueOf(temp);
			 result[i][1]="Not a Letter";
		 }
	 }
	 return result;
  }
  
  //Method to display of vowels and consonents
  public static void display(String[][] text,int length){
	  System.out.println("Character\tType");
	  for(int i=0;i<length;i++){
		  
		System.out.println("\t"+ text[i][0] +"\t" + text[i][1]);

	  }
  }
 
  
  public static void main(String[] args) {
    // Take user input for Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
	int length = text.length();
 

    // Computing the string uppercase to lowecase using user defined method
    String result1  = VowelsAndConsonants2D.toLowerCaseUserDefined(text);
	
    
	//computing the vowels and consonants
	String[][] result2 = VowelsAndConsonants2D.isVowelsAndConsonants(result1);
	
	
	//Displaying the vowels and consonents
	VowelsAndConsonants2D.display(result2,length);

	
	sc.close();
  }
}
