package tourmate;

//Domestic trip implementation
public class DomesticTrip extends Trip {

 public DomesticTrip(String destination, int duration,
                      Transport transport, Hotel hotel, Activity activity) {
     super(destination, duration, transport, hotel, activity);
 }

 // Polymorphism: domestic booking logic
 @Override
 public void book() {
     System.out.println("Booking Domestic Trip to " + destination);
     transport.book();
     hotel.book();
     activity.book();
     System.out.println("Domestic trip booked. Budget: ₹" + budget);
 }
}

