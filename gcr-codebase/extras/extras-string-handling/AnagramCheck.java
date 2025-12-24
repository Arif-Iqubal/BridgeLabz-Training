//program to check two string are anagram or not
// importing Scanner class from java.util package
import java.util.Scanner;

// Create AnagramCheck class
class AnagramCheck {

    // Checking anagram status
    public static boolean isAnagram(String text1, String text2) {

        if (text1.length() != text2.length())
            return false;

        int[] count = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            count[text1.charAt(i)]++;
            count[text2.charAt(i)]--;
        }

        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter first string: ");
        String text1 = input.nextLine();
        System.out.println("Enter second string: ");
        String text2 = input.nextLine();


		//Calling the method to check strings are anagram or not and displaying result
        if (AnagramCheck.isAnagram(text1, text2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");
    }
}
