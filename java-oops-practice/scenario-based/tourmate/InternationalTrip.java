package tourmate;

//International trip implementation
public class InternationalTrip extends Trip {

 public InternationalTrip(String destination, int duration,
                           Transport transport, Hotel hotel, Activity activity) {
     super(destination, duration, transport, hotel, activity);
 }

 // Polymorphism: international booking logic
 @Override
 public void book() {
     System.out.println("Booking International Trip to " + destination);
     System.out.println("Passport & Visa verification completed.");
     transport.book();
     hotel.book();
     activity.book();
     System.out.println("International trip booked. Budget: ₹" + budget);
 }
}

