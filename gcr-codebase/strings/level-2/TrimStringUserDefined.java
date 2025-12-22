// Program to trim leading and trailing spaces using charAt()
import java.util.Scanner;

public class TrimStringUserDefined {

    // Method to find start and end index after trimming spaces
    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text with spaces: ");
        String text = sc.nextLine();

        // User-defined trim
        int[] indexes = trimIndexes(text);
        String userTrimmed = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrimmed = text.trim();

        // Compare both strings
        boolean isSame = compareStrings(userTrimmed, builtInTrimmed);

        System.out.println("User Defined Trimmed Text : " + userTrimmed);
        System.out.println("Built-in Trimmed Text     : " + builtInTrimmed);
        System.out.println("Both Strings Are Equal    : " + isSame);

        sc.close();
    }
}
