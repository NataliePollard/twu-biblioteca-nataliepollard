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
        String displayTitle =  pad(title, 30);
        String displayAuthor = pad(author, 20);

        return(displayTitle + displayAuthor + yearPublished);
    }

    private String pad(String s, int maxLength) {
        int sLength = s.length();
        if(sLength > maxLength)
        {
            s = s.substring(0 , maxLength - 4);
            s += "... ";
        }
        else{
            for( int i = 0; i < (maxLength - sLength); i++) {
                s += " ";
            }
        }
        return s;
    }
}
