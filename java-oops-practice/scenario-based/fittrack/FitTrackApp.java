package fittrack;

//Main class to test FitTrack application
public class FitTrackApp {

 public static void main(String[] args) {

     // Create user profile with custom goal
     UserProfile user = new UserProfile(
             "Arif Iqubal",
             22,
             70.5,
             "Weight Loss",
             1800
     );

     // Display user details
     user.printProfile();
     System.out.println();

     // Create workouts
     Workout cardio = new CardioWorkout(30);     // 30 minutes
     Workout strength = new StrengthWorkout(40); // 40 minutes

     // Perform cardio workout
     cardio.startWorkout();
     cardio.stopWorkout();

     // Perform strength workout
     strength.startWorkout();
     strength.stopWorkout();

     // Total calories burned
     int totalCaloriesBurned = (int) (cardio.getCaloriesBurned() + strength.getCaloriesBurned());

     // Calculate daily progress
     int remainingCalories = user.calculateProgress(totalCaloriesBurned);

     System.out.println();
     System.out.println("Calories Burned Today: " + totalCaloriesBurned);
     System.out.println("Remaining Calories to Target: " + remainingCalories);
 }
}

