package medistore;
//Importing LocalDate form java.time package
import java.time.LocalDate;

//Inheriting the properties Medicine class
public class Syrup extends Medicine {

	//Parameterized constructor
	public Syrup(String name, int price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}

	///Overriding parent method
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(expiryDate.minusDays(20));
		
	}

}
