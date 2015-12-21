package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nataliepollard on 12/20/15.
 */
public class LibraryTest {

    Library myLibrary;
    @Before
    public void setup() {
        myLibrary = new Library();
    }
    String completeLibrary = "Harry Potter                  J K Rowling         1997\n" +
            "The Lord of the Rings         J R R Tolkein       1954\n" +
            "The Chronicals of Narnia, ... C S Lewis           1939\n";
    String correctCheckoutString = ("Thank you! Enjoy the book");
    String completeLibMinusHarryPotter =
                    "The Lord of the Rings         J R R Tolkein       1954\n" +
                    "The Chronicals of Narnia, ... C S Lewis           1939\n";
    String correctReturnString = ("Thank you for returning the book.");
    String completeLibraryReordered =
                    "The Lord of the Rings         J R R Tolkein       1954\n" +
                    "The Chronicals of Narnia, ... C S Lewis           1939\n" +
                            "Harry Potter                  J K Rowling         1997\n";
    String incorrectReturnString = "That is not a valid book to return.";
    String incorrectRemovalString = "That book is not available";

    @Test
    public void testListBooks() throws Exception {
        assertEquals(completeLibrary, myLibrary.listBooks() );
    }

    @Test
    public void testCheckoutBook() throws Exception {
        assertEquals(myLibrary.checkoutBook("Harry Potter"), correctCheckoutString);
        assertEquals(myLibrary.listBooks(), completeLibMinusHarryPotter);
    }

    @Test
    public void testCheckoutBookNotInLibrary() throws Exception {
        assertEquals(myLibrary.checkoutBook("Green Eggs and Ham"), incorrectRemovalString);
        assertEquals(myLibrary.listBooks(), completeLibrary);
    }

    @Test
    public void testReturnBook() throws Exception {
        assertEquals(myLibrary.checkoutBook("Harry Potter"), correctCheckoutString);
        assertEquals(myLibrary.listBooks(), completeLibMinusHarryPotter);
        assertEquals(myLibrary.returnBook("Harry Potter"), correctReturnString );
        assertEquals(completeLibraryReordered, myLibrary.listBooks());
    }

    @Test
    public void testReturnBookDoesNotBelong() throws Exception {
        assertEquals(myLibrary.returnBook("Ender's Game"), incorrectReturnString );
        assertEquals(completeLibrary, myLibrary.listBooks());
    }

    @Test
    public void testReturnBookAlreadyThere() throws Exception {
        assertEquals(myLibrary.returnBook("Harry Potter"), incorrectReturnString );
        assertEquals(completeLibrary, myLibrary.listBooks());
    }
}