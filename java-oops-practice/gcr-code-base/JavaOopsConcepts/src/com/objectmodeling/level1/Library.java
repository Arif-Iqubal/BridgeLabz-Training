package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;
//Create class library
public class Library {
	//Created a private instance of library class
    private String libraryName;
    private List<Book> books;

    //Created parameterized constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }
    
    //Public method to access private instance
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to " + libraryName);
    }
    //Public method to access private instance
    public void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}

