//program to replace a word in sentence
// importing Scanner class from java.util package
import java.util.Scanner;

// Create ReplaceWord class
class ReplaceWord {

    // Returning modified sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter sentence: ");
        String sentence = input.nextLine();
        System.out.println("Enter word to replace: ");
        String oldWord = input.nextLine();
        System.out.println("Enter new word: ");
        String newWord = input.nextLine();

		//Calling replace method to replace old word with new word and displaying result
        System.out.println("Modified Sentence: " +
                ReplaceWord.replaceWord(sentence, oldWord, newWord));
    }
}
