// Program to calculate BMI of 10 persons
import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display BMI details
    public static void display(String[][] data) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                data[i][0] + "\t\t" +
                data[i][1] + "\t\t" +
                data[i][2] + "\t\t" +
                data[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int persons = 10;

        double[][] inputData = new double[persons][2];

        // Take user input
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            inputData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            inputData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        String[][] result = calculateBMI(inputData);

        // Display result
        display(result);

        sc.close();
    }
}
