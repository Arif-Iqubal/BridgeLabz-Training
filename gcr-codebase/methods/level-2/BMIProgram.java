// Program to calculate BMI of 10 persons
import java.util.Scanner;

class BMIProgram {

	// Method to calculate BMI and populate the array
	public static void calculateBMI(double[][] data) {
		for (int i = 0; i < 10; i++) {
			double heightInMeter = data[i][1] / 100;
			data[i][2] = data[i][0] / (heightInMeter * heightInMeter);
		}
	}

	// Method to determine BMI status
	public static String[] determineBMIStatus(double[][] data) {
		String[] status = new String[10];

		for (int i = 0; i < 10; i++) {
			double bmi = data[i][2];

			if (bmi < 18.5) {
				status[i] = "Underweight";
			} else if (bmi < 25) {
				status[i] = "Normal";
			} else if (bmi < 40) {
				status[i] = "Overweight";
			} else {
				status[i] = "Obese";
			}
		}
		return status;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 2D array: weight, height, BMI
		double[][] data = new double[10][3];

		// Taking input
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter details of person " + (i + 1));
			System.out.print("Weight (kg): ");
			data[i][0] = input.nextDouble();

			System.out.print("Height (cm): ");
			data[i][1] = input.nextDouble();
		}

		calculateBMI(data);
		String[] status = determineBMIStatus(data);

		// Display output
		for (int i = 0; i < 10; i++) {
			System.out.printf("The player having weight " + data[i][0] + " and height " + data[i][1] + " have bmi " + data[i][2] + "  with status " + status[i] + " ");
		}

		input.close();
	}
}
