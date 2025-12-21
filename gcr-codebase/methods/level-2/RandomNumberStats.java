// Program to generate 4-digit random numbers and find average, min and max
class RandomNumberStats {

	// Method to generate 4-digit random numbers
	public static int[] generate4DigitRandomArray(int size) {

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = 1000 + (int)(Math.random() * 9000);
		}
		return arr;
	}

	// Method to find average, min and max
	public static double[] findAverageMinMax(int[] numbers) {

		int sum = 0;
		int min = numbers[0];
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			min = Math.min(min, numbers[i]);
			max = Math.max(max, numbers[i]);
		}

		double average = (double) sum / numbers.length;
		return new double[]{average, min, max};
	}

	public static void main(String[] args) {

		//Calling method to generate 4digit random number
		int[] numbers = generate4DigitRandomArray(5);

		System.out.println("Generated Numbers:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		double[] result = findAverageMinMax(numbers);

		System.out.println("\nAverage: " + result[0]);
		System.out.println("Minimum: " + result[1]);
		System.out.println("Maximum: " + result[2]);
	}
}
