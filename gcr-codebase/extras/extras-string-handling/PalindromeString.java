//program to compute string is palindrome or not
// importing Scanner class from java.util package
import java.util.Scanner;

// Create PalindromeString class
class PalindromeString {

    // Returning palindrome status
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
		//Creating object of Scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter a string: ");
        String str = input.nextLine();
		
		//Calling method to check the string is palindorme or not and displaying result
        if (PalindromeString.isPalindrome(str))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}
