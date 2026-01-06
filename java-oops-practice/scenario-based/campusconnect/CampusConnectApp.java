package campusconnect;

//Main class to test the CampusConnect system
public class CampusConnectApp {

 public static void main(String[] args) {

     // Create faculty object
     Faculty faculty = new Faculty(
             101,
             "Dr. Anjali Ojha",
             "anjali@college.edu",
             "Computer Science"
     );

     // Create course object
     Course javaCourse = new Course("Java Programming", faculty);

     // Create student objects
     Student student1 = new Student(201, "Arya Mishra", "arya@college.edu");
     Student student2 = new Student(202, "Arif Iqubal", "arif@college.edu");

     // Add grades to students
     student1.addGrade(8);
     student1.addGrade(9);

     student2.addGrade(7);
     student2.addGrade(8);

     // Enroll students in course
     student1.enrollCourse(javaCourse);
     student2.enrollCourse(javaCourse);

     System.out.println();

     // Polymorphic method calls
     student1.printDetails();
     System.out.println();

     student2.printDetails();
     System.out.println();

     faculty.printDetails();
     System.out.println();

     // Print course details
     javaCourse.printCourseDetails();
 }
}
