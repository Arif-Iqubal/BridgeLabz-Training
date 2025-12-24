//program to find longest word
// importing Scanner class from java.util package
import java.util.Scanner;

// Create LongestWord class
class LongestWord {

    // Returning longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
		
		//Calling method to compute longest word and display result
        System.out.println("Longest Word: " + LongestWord.findLongestWord(sentence));
    }
}
