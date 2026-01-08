package tourmate;

//Abstract base class representing a Trip
public abstract class Trip implements IBookable {

 protected String destination;
 protected int duration;       // in days
 protected double budget;

 // Associated services
 protected Transport transport;
 protected Hotel hotel;
 protected Activity activity;

 // Constructor to create complete trip package
 public Trip(String destination, int duration,
             Transport transport, Hotel hotel, Activity activity) {

     this.destination = destination;
     this.duration = duration;
     this.transport = transport;
     this.hotel = hotel;
     this.activity = activity;

     calculateTotalBudget();   // operator usage
 }

 // Operator usage: + (total budget)
 protected void calculateTotalBudget() {
     budget = transport.getCost()
            + hotel.getCost()
            + activity.getCost();
 }

 public double getBudget() {
     return budget;
 }

 // Abstract method for polymorphic booking
 @Override
 public abstract void book();

 @Override
 public void cancel() {
     transport.cancel();
     hotel.cancel();
     activity.cancel();
     System.out.println("Trip cancelled successfully.");
 }
}
