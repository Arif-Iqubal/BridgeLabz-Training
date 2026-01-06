package fittrack;

//Cardio workout like running, cycling
class CardioWorkout extends Workout {

 public CardioWorkout(int duration) {
     super("Cardio", duration);
 }

 // Cardio burns more calories per minute
 @Override
 public double calculateCalories() {
     return duration * 8.0; // operator usage
 }
}
