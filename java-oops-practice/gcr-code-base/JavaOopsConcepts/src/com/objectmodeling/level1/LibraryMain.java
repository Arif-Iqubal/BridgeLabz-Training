package com.objectmodeling.level1;
//Creating a Library main class which can assess the instance of library and book class
public class LibraryMain {
    public static void main(String[] args) {
    	
    	//Creating object of Book class
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert Martin");
        
        //Creating object of library class in which passing the Books object
        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");
        
        //Adding Books
        library1.addBook(book1);
        library2.addBook(book2);
        
        //showing books details
        library1.showBooks();
        library2.showBooks();
    }
}

