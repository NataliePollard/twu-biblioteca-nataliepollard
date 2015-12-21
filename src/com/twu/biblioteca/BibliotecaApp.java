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
        while(true) {
            String inputString = getUserInput();
            if(inputString.equals("List Books")) {
                listBooks();
            }
            else {
                System.out.println("Select a valid option!");
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

    public static void listBooks() {
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

}
