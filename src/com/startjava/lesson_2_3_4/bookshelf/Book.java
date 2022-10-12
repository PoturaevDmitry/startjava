package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final String publishYear;

    public Book(String author, String title, String publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishYear() {
        return publishYear;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}