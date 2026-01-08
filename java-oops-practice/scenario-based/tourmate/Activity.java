package tourmate;

//Activity service associated with Trip
public class Activity implements IBookable {

 private double cost;   // encapsulated cost

 public Activity(double cost) {
     this.cost = cost;
 }

 public double getCost() {
     return cost;
 }

 @Override
 public void book() {
     System.out.println("Activities booked successfully.");
 }

 @Override
 public void cancel() {
     System.out.println("Activities cancelled.");
 }
}
