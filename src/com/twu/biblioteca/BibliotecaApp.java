package com.twu.biblioteca;

import java.util.LinkedList;
import java.io.*;

public class BibliotecaApp {
    private static LinkedList books;

    public static void main(String[] args) {
        books = new LinkedList();
        Book harryPotter = new Book("Harry Potter", "J K Rowling", 1997);
        Book lotR = new Book("The Lord of the Rings", "J R R Tolkein", 1954);
        books.add(harryPotter);
        books.add(lotR);

        System.out.println("Welcome to Biblioteca!");
        System.out.println("Select one of the following options:");
        System.out.println("List Books");
        System.out.println("Quit");
        System.out.println("Checkout Book");
        while(true) {
            String inputString = getUserInput();

            if (inputString != null) {
                switch(inputString.toLowerCase()) {
                    case "list books":
                        listBooks();
                        break;
                    case "quit":
                        System.exit(0);
                        break;
                    case "checkout book":
                        checkoutBook();
                        break;
                    case "return book":
                        returnBook();
                        break;
                    default:
                        System.out.println("Select a valid option!");
                        break;
                }
            }
        }
    }

    public static void returnBook

    private static void checkoutBook() {
        System.out.println("Enter the title of the book you wish to check out");
        String bookTitle = getUserInput();
        boolean bookRemoved = false;
        for(int i = 0; i < books.size(); i++){
            String bookTit = ((Book) books.get(i)).getTitle();
            if(bookTitle.equals(bookTit)) {
                books.remove(i);
                System.out.println("Thank you! Enjoy the book");
                bookRemoved = true;
                break;
            }
        }
        if(bookRemoved == false) {
            System.out.println("That book is not available");
        }

    }

    private static String getUserInput(){
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }

    private static void listBooks() {
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

}
