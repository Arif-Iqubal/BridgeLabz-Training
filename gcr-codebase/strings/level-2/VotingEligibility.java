// Program to check voting eligibility of students
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "False";
            } else if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

    // Method to display result
    public static void display(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
		
		//Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
		
		//Calling method and computing vote Eligibility
        int[] ages = generateAges(numberOfStudents);
        String[][] result = checkVotingEligibility(ages);
		
		//Displaying result
        display(result);
        sc.close();
    }
}
