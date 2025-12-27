package com.constructorandinstance.level1;

//inheriting the properties of BookLibrarySystem Class
public class EBook extends BookLibrarySystem {

	EBook(int ISNB, String title, String author) {
		super(ISNB, title, author);
		
	}

	public static void main(String[] args) {
		//Creating object of EBook class
		EBook book1 = new EBook(3553,"2-States","Chetan Bhagat");
		book1.displayDetails();
		//Accessing public instance
		book1.ISNB = 6757;
		//Accessing protected instance
		book1.title = "Half-Girlfriend";
		book1.displayDetails();
		

	}

}
