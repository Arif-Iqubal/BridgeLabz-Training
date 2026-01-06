package edumentor;

//Base class representing a common user in EduMentor
class User {

 protected int userId;
 protected String name;
 protected String email;

 // Constructor to initialize user details
 public User(int userId, String name, String email) {
     this.userId = userId;
     this.name = name;
     this.email = email;
 }

 // Method to print basic user details
 public void printDetails() {
     System.out.println("User ID: " + userId);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
 }
}
