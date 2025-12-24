import java.util.Scanner;

// Create MostFrequentChar class
class MostFrequentChar {

    // Returning most frequent character
    public char mostFrequent(String str) {
        int max = 0;
        char result = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count > max) {
                max = count;
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        MostFrequentChar obj = new MostFrequentChar();
        System.out.println("Most Frequent Character: " + obj.mostFrequent(str));
    }
}
