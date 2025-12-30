package com.objectmodeling.level1;
//Create a book class
public class Book {
	//Private instance of book class
    private String title;
    private String author;
    
    //Created parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    //Public method to access private instance
    public String getTitle() {
        return title;
    }
    
    //Public method to access private instance
    public String getAuthor() {
        return author;
    }
}
