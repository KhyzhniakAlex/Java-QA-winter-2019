package com.epam.javaQA.homework;

import java.util.Date;

public class Books implements IBooks {

    private Book[] books;

    public Books(int lenght) {

        books = new Book[lenght];
    }

    public Books() {}

    public void addBook(Book book) {

        for(int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void printAllBooks() {

        for(Book b : books) {
            if (b != null) b.view();
        }
    }

    public void changePrice(boolean whatToChange, double percent) {

        if (whatToChange) {
            for (Book book : books) {
                if (book != null)
                    book.setPrice((book.getPrice() * percent / 100) + book.getPrice());
            }
        } else {
            for (Book book : books) {
                if (book != null)
                    book.setPrice(book.getPrice() - (book.getPrice() * percent / 100));
            }
        }
    }

    public Book[] findAllAuthorBooks(String author) {

        Book[] newBooks = new Book[books.length];
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
