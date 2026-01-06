package fittrack;

//Base Workout class
abstract class Workout implements ITrackable {

 protected String type;
 protected int duration; // in minutes

 // Calories burned should not be modified directly
 protected double caloriesBurned;

 // Internal workout logs must remain private
 private boolean isActive;

 // Constructor
 public Workout(String type, int duration) {
     this.type = type;
     this.duration = duration;
     this.isActive = false;
 }

 // Start workout
 @Override
 public void startWorkout() {
     isActive = true;
     System.out.println(type + " workout started.");
 }

 // Stop workout
 @Override
 public void stopWorkout() {
     isActive = false;
     caloriesBurned = calculateCalories();
     System.out.println(type + " workout stopped.");
 }

 // Polymorphic calorie calculation
 public abstract double calculateCalories();

 // Getter method (no direct access to logs)
 public double getCaloriesBurned() {
     return caloriesBurned;
 }
}
