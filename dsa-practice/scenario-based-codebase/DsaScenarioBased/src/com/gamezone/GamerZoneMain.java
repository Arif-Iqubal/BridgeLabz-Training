package com.gamezone;

public class GamerZoneMain {
    public static void main(String[] args) {

        // Creating array of players with their scores
        Player[] players = {
            new Player("Arif", 4500),
            new Player("John", 7200),
            new Player("Alex", 5100),
            new Player("Ravi", 9000),
            new Player("Sara", 6800)
        };

        // Calling Quick Sort to rank players
        GamerZoneRanking.quickSort(players, 0, players.length - 1);

        // Displaying sorted leaderboard
        System.out.println("Leaderboard (High to Low):");
        for (Player p : players) {
            System.out.println(p.name + " → " + p.score);
        }
    }
}
