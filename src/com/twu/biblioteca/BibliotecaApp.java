package com.twu.biblioteca;

import java.util.LinkedList;
import java.io.*;

public class BibliotecaApp {


    public static void main(String[] args) {

        Library myLibrary = new Library();

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
                        System.out.println(myLibrary.listBooks());
                        break;
                    case "quit":
                        System.exit(0);
                        break;
                    case "checkout book": {
                        System.out.println("Enter the title of the book you wish to check out");
                        String bookTitle = getUserInput();
                        System.out.println(myLibrary.checkoutBook(bookTitle));
                        break;
                    }

                    default:
                        System.out.println("Select a valid option!");
                        break;
                }
            }
        }
    }

    public static String getUserInput(){
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
}
