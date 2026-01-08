package tourmate;

//Hotel service associated with Trip
public class Hotel implements IBookable {

 private double cost;   // hidden internal pricing

 public Hotel(double cost) {
     this.cost = cost;
 }

 public double getCost() {
     return cost;
 }

 @Override
 public void book() {
     System.out.println("Hotel booked successfully.");
 }

 @Override
 public void cancel() {
     System.out.println("Hotel booking cancelled.");
 }
}
