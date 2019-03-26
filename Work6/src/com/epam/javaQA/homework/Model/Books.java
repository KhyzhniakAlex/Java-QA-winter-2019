package com.epam.javaQA.homework.Model;

import java.util.Date;

public class Books {

    private Book[] books;
    private int counter = 0;

    public Books(int lenght) {
        books = new Book[lenght];
    }

    public Books(Book[] Books) {
        for(Book b : Books) {
            if (b != null) counter++;
        }
        books = Books;
    }

    public Books() {}

    public boolean addBook(Book book) {

        if (counter >= books.length)
            return false;
        else {
            books[counter++] = book;
            return true;
        }
    }

    public String printAllBooks() {

        if (counter == 0) return "There is no books";

        String book = "";
        for(int i = 0; i < counter; i++) {
            book += books[i].view();
        }
        return book;
    }

    public void changePrice(boolean whatToChange, double percent) {

        for(Book b : books) {
            b.changePrice(whatToChange, percent);
        }
    }

    public Book[] findAllAuthorBooks(String author) {

        Book[] newBooks = new Book[counter];
        int i = 0;

        for(Book b : books) {
            if (b.getAuthor().equals(author)) {
                newBooks[i++] = b;
            }
        }

        return newBooks;
    }

    public Book[] findAllBooksAfterDate(Date date) {

        Book[] newBooks = new Book[books.length];
        int i = 0;

        for(Book b : books) {
            if (b.getReleaseYear().getTime() > date.getTime()) {
                newBooks[i++] = b;
            }
        }
        return newBooks;
    }
}
