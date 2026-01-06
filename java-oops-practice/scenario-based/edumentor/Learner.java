package edumentor;

//Learner class inherits User and implements certification
class Learner extends User implements ICertifiable {

 private String courseType; // short-course or full-time

 // Constructor
 public Learner(int userId, String name, String email, String courseType) {
     super(userId, name, email);
     this.courseType = courseType;
 }

 // Polymorphic certificate generation
 @Override
 public void generateCertificate() {
     if (courseType.equalsIgnoreCase("short")) {
         System.out.println("Certificate: Short Course Completion Certificate issued to " + name);
     } else {
         System.out.println("Certificate: Full-Time Course Professional Certificate issued to " + name);
     }
 }
}
