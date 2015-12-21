package com.twu.biblioteca;

import java.util.LinkedList;

/**
 * Created by nataliepollard on 12/20/15.
 */

public class Library {
    private static LinkedList allBooks;
    private static LinkedList currentlyAvailableBooks;

    public Library(){
        allBooks = new LinkedList();
        currentlyAvailableBooks = new LinkedList();
        Book harryPotter = new Book("Harry Potter", "J K Rowling", 1997);
        Book lotR = new Book("The Lord of the Rings", "J R R Tolkein", 1954);
        Book narnia = new Book("The Chronicals of Narnia, The Lion the Witch and the Wardrobe", "C S Lewis",1939);
        allBooks.add(harryPotter);
        allBooks.add(lotR);
        allBooks.add(narnia);

        for(int i = 0; i < allBooks.size(); i++) {
            currentlyAvailableBooks.add(allBooks.get(i));
        }
    }

    public static String returnBook(String title) {
        int indexInAllBooks = getIndexOfBooksTitle(allBooks,title);
        int indexInCurrentlyAvailableBooks = getIndexOfBooksTitle(currentlyAvailableBooks,title);

        //if the book belongs to the library but is not currently available
        if(indexInAllBooks >= 0 && indexInCurrentlyAvailableBooks < 0)
        {
            currentlyAvailableBooks.add(allBooks.get(indexInAllBooks));
            return "Thank you for returning the book.";
        }
        else return "That is not a valid book to return.";
    }

    private static int getIndexOfBooksTitle(LinkedList list, String title) {
        for(int i = 0; i < list.size(); i++) {
            String bookTit = ((Book) list.get(i)).getTitle();
            if (title.toLowerCase().equals(bookTit.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public static String checkoutBook(String title) {
        int indexOfBook = getIndexOfBooksTitle(currentlyAvailableBooks, title);
        if(indexOfBook >= 0){
            currentlyAvailableBooks.remove(indexOfBook);
            return("Thank you! Enjoy the book");
        }
        else
            return "That book is not available";
    }

    public static String listBooks() {
        String returnString = "";
        for(int i = 0; i < currentlyAvailableBooks.size(); i++) {
            returnString += currentlyAvailableBooks.get(i) + "\n";
        }
        return returnString;
    }
}
