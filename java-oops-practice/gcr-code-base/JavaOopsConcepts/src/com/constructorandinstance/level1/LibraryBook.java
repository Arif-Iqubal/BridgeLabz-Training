package com.constructorandinstance.level1;




public class LibraryBook {
	//Declaring the variables to get the details of hand book
	String bookTitle;
	String bookAuthor;
	double price;
	boolean availability;
	//Default Constructor
	LibraryBook(){
		System.out.println("Deafult constructor called");
	}
	
	//parameterized constructor
	LibraryBook(String bookTitle,String bookAuthor,double price,boolean availability){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
		this.availability=availability;
	}
	
	//creating the method to display the output
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	
	//Method to borrow book
	void canBorrow() {
		if(availability) {
			System.out.println("You can borrow this book,\n Title: "+bookTitle + "\n Author : " + bookAuthor );

		}
		else {
			System.out.println(bookTitle + " book is not available");

		}
	}
	public static void main(String[] args) {
	LibraryBook book1= new LibraryBook("2States", "Chetan Bhagat", 500,true);
	LibraryBook book2=new LibraryBook("Wings Of Fire","Abdul kalam.A.P.J",  500,false);
	LibraryBook book3 = new LibraryBook();
	book3.bookAuthor = "Murakami";
	book3.bookTitle = "Breif history of time";
	book3.price = 450;
	book3.availability = true;
	
	//Calling method to display book details
	book1.displayBookDetails();
	book2.displayBookDetails();
	book3.displayBookDetails();
	
	//Calling method to check and display can we borrow the book
	book1.canBorrow();
	book2.canBorrow();
	book3.canBorrow();
	
	

	}
}



