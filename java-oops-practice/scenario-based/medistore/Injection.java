package medistore;
//Importing local date from java.time package
import java.time.LocalDate;

//Inheriting properties of Medicine class
public class Injection extends Medicine {

	//parameterized constructor
	public Injection(String name, int price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}
	
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(expiryDate.minusDays(10));
		
	}

}
