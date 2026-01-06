package campusconnect;

//Faculty class extends Person
class Faculty extends Person {

 // Faculty-specific field
 private String department;

 // Constructor to initialize faculty details
 public Faculty(int id, String name, String email, String department) {
     super(id, name, email);
     this.department = department;
 }

 // Polymorphic method implementation
 @Override
 public void printDetails() {
     System.out.println("---- Faculty Details ----");
     super.printDetails();
     System.out.println("Department: " + department);
 }
}
