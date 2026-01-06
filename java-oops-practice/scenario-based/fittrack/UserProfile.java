package fittrack;

//Class representing user profile and fitness goals
class UserProfile {

 private String name;
 private int age;

 // Private health data (encapsulation)
 private double weight;

 private String goal;          // e.g., Weight Loss, Muscle Gain
 private int dailyCalorieTarget;

 // Constructor with default goal
 public UserProfile(String name, int age, double weight) {
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = "Maintain Fitness";
     this.dailyCalorieTarget = 2000;   // default target
 }

 // Constructor with custom goal
 public UserProfile(String name, int age, double weight, String goal, int dailyCalorieTarget) {
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = goal;
     this.dailyCalorieTarget = dailyCalorieTarget;
 }

 // Getter (no setter) to protect weight
 public double getWeight() {
     return weight;
 }

 // Calculate daily progress using operators
 public int calculateProgress(int caloriesBurned) {
     return dailyCalorieTarget - caloriesBurned;
 }

 // Display user profile
 public void printProfile() {
     System.out.println("User: " + name);
     System.out.println("Age: " + age);
     System.out.println("Goal: " + goal);
     System.out.println("Daily Target: " + dailyCalorieTarget + " kcal");
 }
}

