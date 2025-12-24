import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Create a class DateArithmetic to perform arithmetic operations on dates
public class DateArithmetic{

    public static void main(String[] args) {
        // Define the initial date
        LocalDate initialDate = LocalDate.of(2025, 10, 26); 

        // Define a formatter for clean output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        System.out.println("Original Date: " + initialDate.format(formatter));

        // Add 7 days, 1 month, and 2 years to the initial date
        LocalDate resultDate = initialDate.plusDays(7)
                                        .plusMonths(1)
                                        .plusYears(2);

        System.out.println("After adding 7 days, 1 month, and 2 years: " + resultDate.format(formatter));

        // Subtract 3 weeks from the result
        LocalDate finalDate = resultDate.minusWeeks(3);

        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
    }
}
