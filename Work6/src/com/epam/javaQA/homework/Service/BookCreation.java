package com.epam.javaQA.homework.Service;

import com.epam.javaQA.homework.Model.Book;
import com.epam.javaQA.homework.Model.Books;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookCreation {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    public void createBook(int iterations, Books books) throws ParseException {

        while(iterations > 0) {

            Book newBook = new Book();

            System.out.print("\nName: ");
            newBook.setName(InputUtil.inputString());

            System.out.print("Author: ");
            newBook.setAuthor(InputUtil.inputString());

            System.out.print("Publisher: ");
            newBook.setPublisher(InputUtil.inputString());

            System.out.print("Date: ");
            newBook.setReleaseYear(format.parse(InputUtil.inputString()));

            System.out.print("Amount of pages: ");
            newBook.setPageAmount(InputUtil.inputInt());

            System.out.print("Price: ");
            newBook.setPrice(InputUtil.inputDouble());

            books.addBook(newBook);

            iterations--;
        }
    }
}
