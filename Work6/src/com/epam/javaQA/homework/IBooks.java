package com.epam.javaQA.homework;

import java.util.Date;

public interface IBooks {

    void addBook(Book book);
    void printAllBooks();
    void changePrice(boolean whatToChange, double percent);
    Book[] findAllAuthorBooks(String author);
    Book[] findAllBooksAfterDate(Date date);
}
