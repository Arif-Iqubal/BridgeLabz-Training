package medistore;

//Importing LocalDate from java.time package
import java.time.LocalDate;

//Main class to perform different operations
public class MediStoreApp {

    public static void main(String[] args) {

    	//Creating object of Tablets, Syrup and Injection class
        Medicine m1 = new Tablets("Paracetamol", 5, LocalDate.of(2026, 5, 10));
        Medicine m2 = new Syrup("Cough Syrup", 120, LocalDate.of(2025, 3, 1));
        Medicine m3 = new Injection("Insulin", 800, LocalDate.of(2025, 2, 1));

        
        //Calling method to sell medicine and check expiry date of medicine
        System.out.println("Selling Paracetamol: ₹" + m1.sell(50));
        System.out.println("Tablet expired? " + m1.checkExpiry());

        System.out.println("Selling Syrup: ₹" + m2.sell(3));
        System.out.println("Syrup expired? " + m2.checkExpiry());

        System.out.println("Selling Injection: ₹" + m3.sell(1));
        System.out.println("Injection expired? " + m3.checkExpiry());
    }
}
