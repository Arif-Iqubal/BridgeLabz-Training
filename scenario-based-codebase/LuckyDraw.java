//Program for lucky draw in diwali festival
//importing Scanner class form java.util package
import java.util.Scanner;
public class LuckyDraw{
	public static void main(String[] args){
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("----------------------");
			System.out.println("Check your Luck");
			System.out.println("----------------------");
			System.out.println("Enter your number");
			System.out.println("----------------------");
			int number = input.nextInt();
			
			if((number % 3== 0) && (number % 5 ==0)){
				System.out.println("--------------------------------");
				System.out.println("Conguratulations You won a prize");
				System.out.println("--------------------------------");
			}
			else{
				System.out.println("--------------------------------");
				System.out.println("Better Luck Next Time");
				System.out.println("--------------------------------");
			}
			
			System.out.println("----------------------");
			System.out.println("1 -> Exit\n2 -> Next Player");
			System.out.println("----------------------");
			int temp = input.nextInt();
			if(temp == 1){
				break;
			}
		}
		
		
		input.close();
	}
}