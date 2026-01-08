package medistore;
//Importing LocalDate from java.time package
import java.time.LocalDate;

//Super class that implements ISellable interface
public class Medicine implements ISellable {
	
	//Private instant of class
	private int quantity = 10;
	private int price;
	
	//Protected instance of class
	protected String name;
	protected LocalDate expiryDate;

	
	//Parameterized constructor
	public Medicine(String name, int price, LocalDate expiryDate) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	//Overriding interface method
	@Override
	public double sell(int qty) {
		if(qty>getQuantity()) {
			System.out.println("Insufficient medicine");
			return -1;
		}
		
		double amount = this.getPrice() * qty;
		double discountPercentage = computeDiscount(amount);
		double discountAmount = (amount * discountPercentage) /100;
		double totalAmount = amount - discountAmount;
		return totalAmount;
		
	}

	//Method to compute discount
	public double computeDiscount(double amount) {
		if(amount < 200) {
			return 5;
		}
		else if(amount < 400) {
			return 10;
		}
		return 20;
	}
	
	//Overriding interface method to check medicine expire
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(this.expiryDate);
		
	}
	

	//getter method to get quantity
	public int getQuantity() {
		return quantity;
	}

	//Setter method to set quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//Getter method to get price
	public int getPrice() {
		return price;
	}

	//Setter method to set price
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
