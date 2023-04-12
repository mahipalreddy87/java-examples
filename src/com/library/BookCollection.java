package com.library;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private int quantity; //Number of copies for each book collection
    long lastRefreshed = 0;

    List<Book> books = new ArrayList<>(); //Collection of individual books

    public BookCollection(int quantity) { //Creates a collection of books with a defined # of copies
        this.quantity = quantity;
        for(int i = 0; i < quantity; i++) {
            books.add(new Book());
        }
    }

    public void addBook() { //Adds a new book object to the collection of books
        books.add(new Book());
    }

    public boolean borrowBook() { //Borrows a book from the collection
        for(Book b : books) {
            if(!b.isBorrowed()) {
                b.setToBorrowed();
                lastRefreshed = System.currentTimeMillis();
                return true; //Book has been borrowed successfully
            }
            else {
                continue;
            }
        }
        System.out.println("All books are borrowed, sorry");
        return false; //Book has failed to be borrowed
    }

    public boolean returnBook() { //Returns a book back to the catalog
        for(Book b : books) {
            if(b.isBorrowed()) {
                b.setToReturned();
                return true; //Book has been returned successfully
            }
            else {
                continue;
            }
        }
        System.out.println("Cannot return book at this time, sorry!");
        return false; //Book has failed to be returned
    }

    public void printBooks() {
        for(Book b : books) {
            System.out.println("Borrowed? " + b.isBorrowed());
        }
    }

    public int getQuantity() { //Returns the # of copies the collection has, borrowed or not
        return this.quantity;
    }
}
