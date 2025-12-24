import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class DateComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first date
        LocalDate date1 = getDateInput(scanner, "Enter the first date (YYYY-MM-DD): ");

        // Prompt for the second date
        LocalDate date2 = getDateInput(scanner, "Enter the second date (YYYY-MM-DD): ");

        // Compare the dates
        compareDates(date1, date2);

        scanner.close();
    }

    
     //Helper method to get a valid LocalDate input from the user.
     
    private static LocalDate getDateInput(Scanner scanner, String prompt) {
        LocalDate date = null;
        while (date == null) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                date = LocalDate.parse(input); // Parses the input string into a LocalDate object
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }
        return date;
    }

    
     //Compares the two provided LocalDate objects and prints the result.
     
    private static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        } else {
            // This else block should theoretically not be reached as one of the above must be true
            System.out.println("An unexpected comparison result occurred.");
        }
    }
}
