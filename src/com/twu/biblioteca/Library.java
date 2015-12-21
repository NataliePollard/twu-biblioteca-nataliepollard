package com.twu.biblioteca;

import java.util.LinkedList;

/**
 * Created by nataliepollard on 12/20/15.
 */

public class Library {
    private static LinkedList books;

    public Library(){
        books = new LinkedList();
        Book harryPotter = new Book("Harry Potter", "J K Rowling", 1997);
        Book lotR = new Book("The Lord of the Rings", "J R R Tolkein", 1954);
        books.add(harryPotter);
        books.add(lotR);
    }

    public static String checkoutBook(String title) {
        for(int i = 0; i < books.size(); i++){
            String bookTit = ((Book) books.get(i)).getTitle();
            if(title.equals(bookTit)) {
                books.remove(i);
                return("Thank you! Enjoy the book");
            }
        }
            return "That book is not available";
    }

    public static String listBooks() {
        String returnString = "";
        for(int i = 0; i < books.size(); i++) {
            returnString += books.get(i) + "\n";
        }
        return returnString;
    }
}
