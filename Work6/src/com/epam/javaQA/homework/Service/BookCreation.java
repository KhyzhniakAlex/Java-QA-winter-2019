package com.epam.javaQA.homework.Service;

import com.epam.javaQA.homework.Exceptions.ValidationException;
import com.epam.javaQA.homework.Model.Book;
import com.epam.javaQA.homework.Model.Books;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookCreation {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    public void createBook(int iterations, Books books) throws ParseException, ValidationException {

        while(iterations > 0) {
            Book newBook = new Book();
            Validator validator = new Validator();

            System.out.print("\nName: ");
            newBook.setName(validator.checkText(InputUtil.inputString(), "Name"));

            System.out.print("Author: ");
            newBook.setAuthor(validator.checkText(InputUtil.inputString(), "Author"));

            System.out.print("Publisher: ");
            newBook.setPublisher(validator.checkText(InputUtil.inputString(), "Publisher"));

            System.out.print("Date: ");
            newBook.setReleaseYear(format.parse(validator.checkDate(InputUtil.inputString())));

            System.out.print("Amount of pages: ");
            newBook.setPageAmount(validator.checkPages(InputUtil.inputInt()));

            System.out.print("Price: ");
            newBook.setPrice(validator.checkPrice(InputUtil.inputDouble()));

            books.addBook(newBook);
            iterations--;
        }
    }
}
