package edumentor;

//Instructor class extends User
class Instructor extends User {

 private String specialization;

 // Constructor
 public Instructor(int userId, String name, String email, String specialization) {
     super(userId, name, email);
     this.specialization = specialization;
 }

 // Instructor-specific method
 public void printDetails() {
     super.printDetails();
     System.out.println("Specialization: " + specialization);
 }
}
