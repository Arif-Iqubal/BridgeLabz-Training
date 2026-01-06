package edumentor;

import java.util.ArrayList;

//Quiz class to manage questions and scoring
class Quiz {

 // Internal question bank (must remain private)
 private ArrayList<String> questions;

 // Answers are encapsulated and cannot be modified
 private final ArrayList<String> correctAnswers;

 private int score;
 private String difficulty;

 // Constructor with difficulty level
 public Quiz(String difficulty) {
     this.difficulty = difficulty;
     questions = new ArrayList<>();
     correctAnswers = new ArrayList<>();
     score = 0;
 }

 // Add questions internally
 public void addQuestion(String question, String answer) {
     questions.add(question);
     correctAnswers.add(answer);
 }

 // Conduct quiz and calculate score
 public void attemptQuiz(ArrayList<String> userAnswers) {
     score = 0;

     // Operator usage for scoring
     for (int i = 0; i < correctAnswers.size(); i++) {
         if (userAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
             score++; // increment score
         }
     }
 }

 // Calculate percentage using operators
 public double getPercentage() {
     return ((double) score / correctAnswers.size()) * 100;
 }

 // Display quiz result
 public void showResult() {
     System.out.println("Difficulty Level: " + difficulty);
     System.out.println("Score: " + score + "/" + correctAnswers.size());
     System.out.println("Percentage: " + getPercentage() + "%");
 }
}
