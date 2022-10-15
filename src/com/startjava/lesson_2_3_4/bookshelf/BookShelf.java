package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];
    private int countBooks;
    private int maxLengthShelf;

    public boolean add(Book book) {
        if (countBooks == CAPACITY) return false;
        int len = book.toString().length();
        if (countBooks == 0  || maxLengthShelf < len) maxLengthShelf = len;
        books[countBooks++] = book;
        updateMaxLengthShelf();
        return true;
    }

    public Book find(String title) {
        int index = indexOf(title);
        if (index == -1) return null;
        return books[index];
    }

    public int hasFreePlace() {
        return CAPACITY - countBooks;
    }

    public boolean delete(String title) {
        int index = indexOf(title);
        if (index == -1) return false;
        countBooks--;
        if (index < books.length - 1) System.arraycopy(books, index + 1, books, index, countBooks - index);
        books[countBooks] = null;
        updateMaxLengthShelf();
        return true;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        updateMaxLengthShelf();
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getMaxLengthShelf() {
        return maxLengthShelf;
    }

    private void updateMaxLengthShelf() {
        if (countBooks == 0) {
            maxLengthShelf = 0;
        } else {
            maxLengthShelf = books[0].toString().length();
            for (int i = 1; i < countBooks; i++) {
                int curLen = books[i].toString().length();
                if (maxLengthShelf < curLen) maxLengthShelf = curLen;
            }
        }
    }

    private int indexOf(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) return i;
        }
        return -1;
    }
}