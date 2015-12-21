package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nataliepollard on 12/20/15.
 */
public class BookTest {
    Book harryPotter = new Book("Harry Potter", "J K Rowling", 1997);
    @Test
    public void testToString() throws Exception {
        assertEquals("Harry Potter\t\tJ K Rowling\t1997",harryPotter.toString());
    }
}