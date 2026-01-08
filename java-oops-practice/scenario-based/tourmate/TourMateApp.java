package tourmate;

public class TourMateApp {

    public static void main(String[] args) {

        Transport t1 = new Transport(15000);
        Hotel h1 = new Hotel(12000);
        Activity a1 = new Activity(3000);

        Trip domestic = new DomesticTrip(
                "Goa", 5, t1, h1, a1);

        Trip international = new InternationalTrip(
                "Paris", 7,
                new Transport(55000),
                new Hotel(45000),
                new Activity(20000));

        domestic.book();
        System.out.println();

        international.book();
    }
}
