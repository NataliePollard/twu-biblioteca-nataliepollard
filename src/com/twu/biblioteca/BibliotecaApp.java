package com.twu.biblioteca;

import java.util.LinkedList;


public class BibliotecaApp {
    private static LinkedList books;

    public static void main(String[] args) {
        books = new LinkedList();
        Book harryPotter = new Book("Harry Potter", "J K Rowling", 1997);
        Book lotR = new Book("The Lord of the Rings", "J R R Tolkein", 1954);
        books.add(harryPotter);
        books.add(lotR);

        System.out.println("Welcome to Biblioteca!");
        System.out.println(books);
    }

}
