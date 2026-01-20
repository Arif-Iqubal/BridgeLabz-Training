package com.gamezone;

class GamerZoneRanking {

    // Quick Sort method to sort players based on score (Descending Order)
    static void quickSort(Player[] players, int low, int high) {

        // Check if there are at least two elements to sort
        if (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(players, low, high);

            // Recursively sort elements before pivot
            quickSort(players, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(players, pivotIndex + 1, high);
        }
    }

    // Partition method to arrange players around pivot
    static int partition(Player[] players, int low, int high) {

        // Select last element's score as pivot
        int pivot = players[high].score;

        // Index of smaller element
        int i = low - 1;

        // Traverse through all elements
        for (int j = low; j < high; j++) {

            // If current player's score is greater than pivot
            // (for descending order leaderboard)
            if (players[j].score > pivot) {
                i++;                     // Increment index
                swap(players, i, j);     // Swap elements
            }
        }

        // Place pivot element at correct position
        swap(players, i + 1, high);

        // Return pivot position
        return i + 1;
    }

    // Swap method to exchange two Player objects
    static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }
}
