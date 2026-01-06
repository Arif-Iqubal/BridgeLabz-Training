package campusconnect;

//Base class representing a common person in the university
class Person {

 // Protected variables so subclasses can access them
 protected int id;
 protected String name;
 protected String email;

 // Constructor to initialize common fields
 public Person(int id, String name, String email) {
     this.id = id;
     this.name = name;
     this.email = email;
 }

 // Method to print basic details (will be overridden)
 public void printDetails() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
 }
}
