//program to find the occurance of a word
// importing Scanner class from java.util package
import java.util.Scanner;

// Create SubstringCount class
class SubstringCount {

    // Returning substring occurrence count
    public static int countSubstring(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
		//Creating a object of scanner class
        Scanner input = new Scanner(System.in);
		
		//Taking user input for the string
        System.out.println("Enter main string: ");
        String str = input.nextLine();

		//Taking user input for the substring
        System.out.println("Enter substring: ");
        String sub = input.nextLine();

        //Calling method to count occurance of substring and displaying result
        System.out.println("Occurrences: " + SubstringCount.countSubstring(str, sub));
    }
}
