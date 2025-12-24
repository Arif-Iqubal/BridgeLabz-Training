//program to count vowels and consonants
// importing Scanner class from java.util package
import java.util.Scanner;

// Create VowelConsonantCount class 
class VowelConsonantCount {

    // Returning count of vowels and consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else 
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
		
		//Creating object of class Scanner
        Scanner input = new Scanner(System.in);
		
		//Taking user input for a string
        System.out.println("Enter a string: ");
        String str = input.nextLine();
		
		//Calling method to count vowels and consonants
        VowelConsonantCount.countVowelsAndConsonants(str);
    }
}
