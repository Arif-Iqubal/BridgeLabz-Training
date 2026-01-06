package edumentor;

import java.util.ArrayList;

//Main class to test EduMentor platform
public class EduMentorApp {

 public static void main(String[] args) {

     // Create instructor
     Instructor instructor = new Instructor(
             1,
             "Dr. Anjali Ojha",
             "anjali@edumentor.com",
             "Artificial Intelligence"
     );

     // Create learner
     Learner learner = new Learner(
             101,
             "Arif Iqubal",
             "arif@edumentor.com",
             "full-time"
     );

     // Create quiz with difficulty
     Quiz quiz = new Quiz("Medium");

     // Add quiz questions
     quiz.addQuestion("What is JVM?", "Java Virtual Machine");
     quiz.addQuestion("What does OOP stand for?", "Object Oriented Programming");

     // Learner answers
     ArrayList<String> answers = new ArrayList<>();
     answers.add("Java Virtual Machine");
     answers.add("Object Oriented Programming");

     // Attempt quiz
     quiz.attemptQuiz(answers);

     // Display results
     System.out.println("----- Quiz Result -----");
     quiz.showResult();

     System.out.println();

     // Generate certificate (polymorphism)
     learner.generateCertificate();
 }
}

