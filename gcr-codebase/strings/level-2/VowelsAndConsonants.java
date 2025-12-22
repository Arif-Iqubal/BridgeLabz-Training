// Program to compute vowels and consonents
import java.util.Scanner;
public class VowelsAndConsonants{
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
  public static String[] isVowelsAndConsonants(String text){
	 int length = text.length();
	 String result[] = new String[length];
	 for(int i =0;i<length;i++){
		 char temp = text.charAt(i);
		 int ascii = temp;
		 if(ascii>= 97 && ascii<=122){
			 if((temp == 'a') || (temp == 'e')|| (temp == 'i') || (temp == 'o') || (temp == 'u')){
				 result[i] = "Vowel";
			 }
			 else{
				 result[i]="Consonant";
			 }
		 }
		 else{
			 result[i]="Not a Letter";
		 }
	 }
	 return result;
  }
  
  //Method to compute number of vowels and consonents
  public static int[] count(String[] text){
	  int vowelCount = 0;
	  int consonentCount = 0;
	  int length = text.length;
	  for(int i =0; i<length;i++){
		  if(text[i]=="Vowel"){
			  vowelCount++;
		  }
		  else if(text[i]=="Consonant"){
			  consonentCount++;
			  
		  }
	  }
	  int[] result = new int[2];
	  result[0]= vowelCount;
	  result[1]= consonentCount;
	  return result;
  }
 
  
  public static void main(String[] args) {
    // Take user input for Text 
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a text: ");
    String text = sc.nextLine().trim();
 

    // Computing the string uppercase to lowecase using user defined method
    String result1  = VowelsAndConsonants.toLowerCaseUserDefined(text);
	
    
	//computing the vowels
	String[] result2 = VowelsAndConsonants.isVowelsAndConsonants(result1);
	
	
	//Computing the number of vowels and consonents
	int[] charCount = VowelsAndConsonants.count(result2);
	
    // Display the result
		
		System.out.println("The string "+ text +" contains " + charCount[0] + " vowels and " +charCount[1] + " consonents" );
		

	
	sc.close();
  }
}
