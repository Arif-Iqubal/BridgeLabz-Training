// Program for Rock Paper Scissors Game
import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    // Method to calculate statistics
    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(Math.round((userWins * 100.0) / games));

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(Math.round((computerWins * 100.0) / games));

        return stats;
    }

    // Method to display result
    public static void display(String[][] stats) {
        System.out.println("Player\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {
		//Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;
		
		//Calling method to compute winner
        for (int i = 1; i <= games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();
            String compChoice = computerChoice();

            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;

            System.out.println("Computer Choice: " + compChoice + " | Winner: " + winner);
        }
		
		//Calling method to compute Stats and display result
        String[][] stats = calculateStats(userWins, computerWins, games);
        display(stats);

        sc.close();
    }
}
