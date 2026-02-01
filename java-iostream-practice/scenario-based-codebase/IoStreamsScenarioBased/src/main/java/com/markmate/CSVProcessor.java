package com.markmate;

import java.io.*;
import java.util.*;

public class CSVProcessor {

    // ✅ CHANGE HERE
    public static List<Student> processCSV(InputStream is) {

        List<Student> students = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(is))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(",");

                    int rollNo = Integer.parseInt(data[0]);
                    String name = data[1];

                    int maths   = Integer.parseInt(data[2]);
                    int science = Integer.parseInt(data[3]);
                    int english = Integer.parseInt(data[4]);

                    int total = maths + science + english;
                    double avg = total / 3.0;

                    students.add(new Student(
                            rollNo,
                            name,
                            total,
                            avg,
                            GradeUtil.calculateGrade(avg)
                    ));

                } catch (NumberFormatException e) {
                    System.out.println("Invalid row skipped: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
