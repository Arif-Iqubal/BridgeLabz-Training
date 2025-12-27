package com.constructorandinstance.level1;

public class BookLibrarySystem {
	public int ISNB;
	protected String title;
	private String author;
	
	//Parameterized constructor
	BookLibrarySystem(int ISNB, String title, String author){
		this.ISNB = ISNB;
		this.title = title;
		this.author = author;
	}
	
	//Set private value using setter method
	public void setAuthor(String author) {
		this.author = author;
	}
	//Getting details of Author using getter method
	public void getAuthor(){
		System.out.println("Author => " + this.author);
	}
	
	public void displayDetails() {
		System.out.println("ISNB => " + ISNB);
		System.out.println("Title => " + title);
		System.out.println("Author => " + author);
	}
	public static void main(String[] args) {
		// Creating object of class 
		BookLibrarySystem book1 = new BookLibrarySystem(3553,"2-States","Chetan Bhagat");
		book1.displayDetails();
		book1.setAuthor("Murakami");
		book1.displayDetails();
		
	}

}

