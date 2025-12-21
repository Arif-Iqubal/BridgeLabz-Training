// Program to find roots of quadratic equation
import java.util.Scanner;

class Quadratic {

	// Method to find roots
	public static double[] findRoots(double a, double b, double c) {

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta > 0) {
			double[] roots = new double[2];
			roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
			roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
			return roots;
		} 
		else if (delta == 0) {
			double[] roots = new double[1];
			roots[0] = -b / (2 * a);
			return roots;
		} 
		else {
			return new double[0];
		}
	}

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking user input for three different numbers
		System.out.print("Enter value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter value of b: ");
		double b = input.nextDouble();
		System.out.print("Enter value of c: ");
		double c = input.nextDouble();

		//computing root
		double[] roots = findRoots(a, b, c);
		
		
		//Displaying root of given quardratic equation
		if (roots.length == 2) {
			System.out.println("Two roots are: " + roots[0] + " and " + roots[1]);
		} 
		else if (roots.length == 1) {
			System.out.println("One root is: " + roots[0]);
		} 
		else {
			System.out.println("No real roots");
		}

		input.close();
	}
}
