package campusconnect;

import java.util.ArrayList;

//Student class extends Person and implements course actions
class Student extends Person implements ICourseActions {

 // Grades are private to ensure encapsulation
 private ArrayList<Integer> grades;

 // List of courses the student is enrolled in
 private ArrayList<Course> courses;

 // Constructor to initialize student details
 public Student(int id, String name, String email) {
     super(id, name, email);   // Call parent constructor
     grades = new ArrayList<>();
     courses = new ArrayList<>();
 }

 // Method to add grades
 public void addGrade(int grade) {
     grades.add(grade);
 }

 // Calculate GPA using arithmetic operators
 public double calculateGPA() {
     int total = 0;

     // Sum all grades
     for (int g : grades) {
         total += g;
     }

     // Return average or 0 if no grades exist
     return grades.size() > 0 ? (double) total / grades.size() : 0.0;
 }

 // Enroll student into a course
 @Override
 public void enrollCourse(Course course) {
     courses.add(course);
     course.addStudent(this);
     System.out.println(name + " enrolled in " + course.getCourseName());
 }

 // Drop student from a course
 @Override
 public void dropCourse(Course course) {
     courses.remove(course);
     course.removeStudent(this);
     System.out.println(name + " dropped " + course.getCourseName());
 }

 // Polymorphic method: behaves differently for Student
 @Override
 public void printDetails() {
     System.out.println("---- Student Details ----");
     super.printDetails();
     System.out.println("GPA: " + calculateGPA());
 }
}
