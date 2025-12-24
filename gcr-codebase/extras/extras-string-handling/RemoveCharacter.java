//program to remove specific character from a string
// importing Scanner class from java.util package
import java.util.Scanner;

// Create RemoveCharacter class
class RemoveCharacter {

    // Returning modified string
    public static String removeChar(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch)
                result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter string: ");
        String str = input.nextLine();
        System.out.println("Enter character to remove: ");
        char ch = input.next().charAt(0);
		
		//Calling method to remove specific character and displaying result
        System.out.println("Modified String: " + RemoveCharacter.removeChar(str, ch));
    }
}
