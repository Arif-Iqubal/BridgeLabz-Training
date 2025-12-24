//program to compare two string lexicographically
// importing Scanner class from java.util package
import java.util.Scanner;

// Create StringCompare class
class StringCompare {

    // Comparing two strings lexicographically
    public static void compareStrings(String text1, String text2) {
        int len = Math.min(text1.length(), text2.length()); //computing the minimum length of string between two string

        for (int i = 0; i < len; i++) {
            if (text1.charAt(i) < text2.charAt(i)) {
                System.out.println("\"" + text1 + "\" comes before \"" + text2 + "\"");
                return;
            }
            else if (text1.charAt(i) > text2.charAt(i)) {
                System.out.println("\"" + text2 + "\" comes before \"" + text1 + "\"");
                return;
            }
        }

        if (text1.length() == text2.length())
            System.out.println("Both strings are equal");
        else if (text1.length() < text2.length())
            System.out.println("\"" + text1 + "\" comes before \"" + text2 + "\"");
        else
            System.out.println("\"" + text2 + "\" comes before \"" + text1 + "\"");
    }

    public static void main(String[] args) {
		//Creating the object of scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter first string: ");
        String text1 = input.nextLine();
        System.out.println("Enter second string: ");
        String text2 = input.nextLine();

        StringCompare obj = new StringCompare();
        obj.compareStrings(text1, text2);
    }
}
