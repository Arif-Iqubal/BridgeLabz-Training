//program to reverse string
// importing Scanner class from java.util package
import java.util.Scanner;

// Create ReverseString class
class ReverseString {

    // Returning reversed string
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
		//Creating object of class Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        //Calling method to reverse string and displaying result
        System.out.println("Reversed String: " + ReverseString.reverse(str));
    }
}
