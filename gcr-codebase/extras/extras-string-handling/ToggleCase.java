//program to convert uppercase to lowercase and lower to uppercase
// importing Scanner class from java.util package
import java.util.Scanner;

// Create ToggleCase class
class ToggleCase {

    // Returning toggled string
    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                result += (char)(ch + 32);
            else if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else
                result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        //Calling method to perform togglecase and display result
        System.out.println("Toggled String: " + ToggleCase.toggleCase(str));
    }
}
