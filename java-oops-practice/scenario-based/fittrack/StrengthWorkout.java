package fittrack;

//Strength workout like weight training
class StrengthWorkout extends Workout {

 public StrengthWorkout(int duration) {
     super("Strength", duration);
 }

 // Strength burns fewer calories per minute
 @Override
 public double calculateCalories() {
     return duration * 5.0; // operator usage
 }
}
