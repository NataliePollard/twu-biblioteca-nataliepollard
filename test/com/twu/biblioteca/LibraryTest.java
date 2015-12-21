package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nataliepollard on 12/20/15.
 */
public class LibraryTest {

    Library myLibrary = new Library();
    String correctString =
    "Harry Potter\t\tJ K Rowling\t1997\n" +
            "The Lord of the Rings\t\tJ R R Tolkein\t1954\n";
    @Test
    public void testListBooks() throws Exception {
        assertEquals(myLibrary.listBooks(),correctString);
    }

    String correctRemovalString = ("Thank you! Enjoy the book");
    String correctStringWithoutHP = "The Lord of the Rings\t\tJ R R Tolkein\t1954\n";
    @Test
    public void testCheckoutBook() throws Exception {
        assertEquals(myLibrary.checkoutBook("Harry Potter"), correctRemovalString);
        assertEquals(myLibrary.listBooks(), correctStringWithoutHP);
    }


}