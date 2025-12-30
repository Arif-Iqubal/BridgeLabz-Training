//Importing Scanner class from java.util package
import java.util.Scanner;
//Program to perform movie ticket hall operations
public class MovieTicket {

    public static void main(String[] args) {
	
		//Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);
		
		//Taking user input for number of customers
        System.out.print("Enter number of customers: ");
        int customerCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
		
		//Taking user input for movie ticket details and compute total bill
        for (int customer = 1; customer <= customerCount; customer++) {

            System.out.println("\nCustomer " + customer + " Booking Details");

            System.out.print("Enter movie type (Action/Comedy/Drama): ");
            String movieType = scanner.nextLine();

            System.out.print("Enter seat type (Gold/Silver): ");
            String seatType = scanner.nextLine();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = scanner.nextLine();

            int ticketPrice = 0;
            int snacksPrice = 0;

            // Switch for movie type pricing
            switch (movieType.toLowerCase()) {
                case "action":
                    ticketPrice = 200;
                    break;
                case "comedy":
                    ticketPrice = 180;
                    break;
                case "drama":
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type!");
                    continue;
            }

            // If condition for seat type
            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks calculation
            if (snacksChoice.equalsIgnoreCase("yes")) {
                snacksPrice = 80;
            }

            int totalAmount = ticketPrice + snacksPrice;
			
			//Displaying final bill
            System.out.println("Total Amount to Pay: ₹" + totalAmount);
        }

        scanner.close();
    }
}
