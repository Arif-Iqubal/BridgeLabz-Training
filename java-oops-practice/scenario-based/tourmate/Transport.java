package tourmate;

//Transport service associated with Trip
public class Transport implements IBookable {

 private double cost;   // cost hidden (encapsulation)

 public Transport(double cost) {
     this.cost = cost;
 }

 public double getCost() {
     return cost;
 }

 @Override
 public void book() {
     System.out.println("Transport booked successfully.");
 }

 @Override
 public void cancel() {
     System.out.println("Transport booking cancelled.");
 }
}
