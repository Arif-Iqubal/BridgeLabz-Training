package com.constructorandinstance.level1;



public class Book {
	//Declaring the variables to get the details of hand book
	String bookTitle;
	String bookAuthor;
	double price;
	//Default Constructor
	Book(){
		System.out.println("Deafult constructor called");
	}
	
	//parameterized constructor
	Book(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	//creating the method to display the output
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	
	public static void main(String[] args) {
	Book book1= new Book("2States", "Chetan Bhagat", 500);
	Book book2=new Book("Wings Of Fire","Abdul kalam.A.P.J",  500);
	Book book3 = new Book();
	book3.bookAuthor = "Murakami";
	book3.bookTitle = "Breif history of time";
	book3.price = 450;
	book1.displayBookDetails();
	book2.displayBookDetails();
	book3.displayBookDetails();

	}
}


