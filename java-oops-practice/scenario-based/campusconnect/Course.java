package campusconnect;

import java.util.ArrayList;

//Course class representing a subject
class Course {

 private String courseName;
 private Faculty faculty;              // Assigned faculty
 private ArrayList<Student> students;  // List of enrolled students

 // Constructor to initialize course details
 public Course(String courseName, Faculty faculty) {
     this.courseName = courseName;
     this.faculty = faculty;
     students = new ArrayList<>();
 }

 // Getter method for course name
 public String getCourseName() {
     return courseName;
 }

 // Add student to course
 public void addStudent(Student student) {
     students.add(student);
 }

 // Remove student from course
 public void removeStudent(Student student) {
     students.remove(student);
 }

 // Print course information
 public void printCourseDetails() {
     System.out.println("Course Name: " + courseName);
     System.out.println("Faculty: " + faculty.name);
     System.out.println("Total Students: " + students.size());
 }
}
