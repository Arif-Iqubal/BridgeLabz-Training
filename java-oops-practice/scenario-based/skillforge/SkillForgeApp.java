package skillforge;

//Importing arrays from java.util package
import java.util.Arrays;

//Main class
public class SkillForgeApp {

    public static void main(String[] args) {

        // Create Instructor
        Instructor instructor = new Instructor("Dr. Sharma", "sharma@skillforge.com");

        // Create Student
        Student student = new Student("Arif", "arif@student.com");

        // Create Course with custom modules
        Course javaCourse = new Course(
                "Java Programming",
                instructor,
                Arrays.asList("OOP", "Collections", "Streams")
        );

        // Progress & grading using operators
        student.updateProgress(3, javaCourse.getTotalModules());
        student.assignScore(85);

        // Generate certificate
        student.generateCertificate();

        // Internal reviews (read-only access)
        javaCourse.addReview("Excellent content");
        System.out.println(javaCourse.getInternalReviews());
    }
}
