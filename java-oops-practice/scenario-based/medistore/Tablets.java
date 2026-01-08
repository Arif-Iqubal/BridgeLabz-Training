package medistore;

//Importing LocalDate from java.time package
import java.time.LocalDate;

//Inheriting properties of medicine class
public class Tablets extends Medicine{

	//Parameterized constructor
	public Tablets(String name, int price, LocalDate expiryDate) {
		super(name, price, expiryDate);
	
	}
	
	//Overriding parent method
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(this.expiryDate);
		
	}
}
