//program to removeDuplicates
// importing Scanner class from java.util package
import java.util.Scanner;

// Create RemoveDuplicates class
class RemoveDuplicates {

    // Returning string without duplicates
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1)
                result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
		//Creating Object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter a string: ");
        String str = input.nextLine();
		
		//Calling method to removeDuplicates and display result
        System.out.println("Modified String: " + RemoveDuplicates.removeDuplicates(str));
    }
}
