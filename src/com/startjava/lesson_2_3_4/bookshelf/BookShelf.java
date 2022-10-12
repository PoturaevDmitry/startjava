package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class BookShelf {

    public static final int MAX_COUNT_PLACES = 10;
    private final Book[] books = new Book[MAX_COUNT_PLACES];
    private int countBooks;

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public boolean add(Book book) {
        if (countBooks == MAX_COUNT_PLACES) return false;
        books[countBooks++] = book;
        return true;
    }

    public Book find(String title) {
        int index = indexOf(title);
        if (index == -1) return null;
        return new Book(books[index].getAuthor(), books[index].getTitle(), books[index].getPublishYear());
    }

    public int checkFreePlaces() {
        return MAX_COUNT_PLACES - countBooks;
    }

    public boolean delete(String title) {
        int index = indexOf(title);
        if (index == -1) return false;
        countBooks--;
        if (index < books.length - 1) System.arraycopy(books, index + 1, books, index, countBooks - index);
        books[countBooks] = null;
        return true;
    }

    public void clear() {
        Arrays.fill(books, null);
        countBooks = 0;
    }

    public int calcLengthShelf() {
        if (countBooks == 0) return 0;
        int maxLen = books[0].toString().length();
        for (int i = 1; i < countBooks && books[i] != null; i++) {
            int curLen = books[i].toString().length();
            if (maxLen < curLen) maxLen = curLen;
        }
        return maxLen;
    }

    private int indexOf(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) return i;
        }
        return -1;
    }
}