package com.twu.biblioteca;

/**
 * Created by nataliepollard on 12/20/15.
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;



    public Book (String name, String author, int yearPublished) {
        this.title = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return(title + "\t\t" + author + "\t" + yearPublished);
    }
}
