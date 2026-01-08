package com.linearandbinarysearch;

import java.io.BufferedReader; // For reading text efficiently
import java.io.FileReader;     // For reading characters from file
import java.io.IOException;    // For handling I/O exceptions

public class FileReaderLineByLine {

    public static void main(String[] args) {

        // Path of the file to be read
        String filePath = "sample.txt";

        // Try-with-resources ensures file is closed automatically
        try (
            // Step 1: Create FileReader object
            FileReader fileReader = new FileReader(filePath);

            // Step 2: Wrap FileReader with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;

            // Step 3: Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

        } catch (IOException e) {
            // Handle file not found or read errors
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
