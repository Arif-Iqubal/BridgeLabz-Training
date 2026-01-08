package medistore;

public interface ISellable {
    double sell(int qty);      // returns total selling price
    boolean checkExpiry();     // checks if medicine is expired
}
