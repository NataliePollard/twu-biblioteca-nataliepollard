package com.twu.biblioteca;

import java.util.LinkedList;


public class BibliotecaApp {
    private static LinkedList books;

    public static void main(String[] args) {
        books = new LinkedList();
        books.add("Harry Potter");
        books.add("Lord of the Rings");

        System.out.println("Welcome to Biblioteca!");
        System.out.println(books);
    }
    
}
