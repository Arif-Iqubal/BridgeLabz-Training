//program of online quiz
//importing Scanner class from java.util package
import java.util.Scanner;

public class OnlineQuiz{
	public static void main(String[] args){
		//Initializing Quizs and their options
		/*1. Science: What is the chemical symbol for water?
			* A) O₂
			* B) H₂O
			* C) CO₂
			* D) NaCl 
			2. Geography: Which planet is known as the "Red Planet"?
			* A) Jupiter
			* B) Venus
			* C) Mars
			* D) Saturn 
			3. History (India): Who is known as the "Father of the Nation" in India?
			* A) Jawaharlal Nehru
			* B) Subhash Chandra Bose
			* C) Mahatma Gandhi
			* D) Sardar Patel 
			4. Biology: What process do plants use to make their food?
			* A) Respiration
			* B) Photosynthesis
			* C) Transpiration
			* D) Fermentation 
			5. World Facts: Which is the largest ocean on Earth?
			* A) Atlantic Ocean
			* B) Indian Ocean
			* C) Arctic Ocean
			* D) Pacific Ocean */
		String [][] quizs = new String[5][3];
		
		quizs[0][0] = "1. Science: What is the chemical symbol for water?";
		quizs[0][1]="A) O2\nB) H2O\nC) CO₂\nD) NaCl";
		quizs[0][2]="B";
		
		quizs[1][0] = "2. Geography: Which planet is known as the Red Planet?";
		quizs[1][1]="A) Jupiter\nB) Venus\nC) Mars\nD) Saturn";
		quizs[1][2]="C";
		
		quizs[2][0] = "3. History (India): Who is known as the Father of the Nation in India?";
		quizs[2][1]="A) Jawaharlal Nehru\nB) Subhash Chandra Bose\nC) Mahatma Gandhi\nD) Sardar Patel";
		quizs[2][2]="C";
		
		quizs[3][0] = "4. Biology: What process do plants use to make their food?";
		quizs[3][1]="A) Respiration\nB) Photosynthesis\nC) Transpiration\nD) Fermentation";
		quizs[3][2]="B";
		
		quizs[4][0] = "5. World Facts: Which is the largest ocean on Earth?";
		quizs[4][1]="A) Atlantic Ocean\nB) Indian Ocean\nC) Arctic Ocean\nD) Pacific Ocean";
		quizs[4][2]="D";
		
		//Creating object of Scanner class
		Scanner input = new Scanner (System.in);
		//Displaying Questions and storing results
		int score = 0;
		System.out.println("--------------------------------");
		System.out.println("Enter the correct options");
		System.out.println("--------------------------------");
		for(int i=0;i<5;i++){
			for(int j=0;j<2;j++){
				System.out.println(quizs[i][j]);
			}
			System.out.println("--------------------------------");
			String temp = input.nextLine();
			
			temp = temp.toUpperCase();
			if(temp.equals(quizs[i][2])){
				System.out.println("Correct Anser");
				score++;
			}else{
				System.out.println("Wrong Anser");
			}
			System.out.println("\n");
		}
		//Displaying The Score
		System.out.println("--------------------------------");
		System.out.println("Total Score out of 5 is : " + score);
		System.out.println("--------------------------------");

		
	}
}