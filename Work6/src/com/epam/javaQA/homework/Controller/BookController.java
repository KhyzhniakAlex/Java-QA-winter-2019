package com.epam.javaQA.homework.Controller;

import com.epam.javaQA.homework.Exceptions.ValidationException;
import com.epam.javaQA.homework.Service.BookCreation;
import com.epam.javaQA.homework.Service.InputUtil;
import com.epam.javaQA.homework.Model.Books;
import com.epam.javaQA.homework.Service.Validator;
import com.epam.javaQA.homework.View.ViewBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    public void run() throws ParseException {

        Books books;
        ViewBook view = new ViewBook();
        Validator validator = new Validator();

        try {
            view.print("Enter size: ");
            int length = InputUtil.inputInt();
            books = new Books(length);

            view.print("\nEnter information about a book: ");
            new BookCreation().createBook(length, books);
            view.print("\n" + books.printAllBooks());

            view.print("\nEnter percent: ");
            books.changePrice(true, validator.checkPrice(InputUtil.inputDouble()));
            view.print("\n" + books.printAllBooks());

            view.print("\nChoose an author: ");
            Books newBooksAuthor = new Books(books.findAllAuthorBooks(validator.checkText(InputUtil.inputString(), "Author")));
            view.print("\n" + newBooksAuthor.printAllBooks());

            view.print("\nWrite a date (yyyy): ");
            Books newBooksDate = new Books(books.findAllBooksAfterDate(format.parse(validator.checkDate(InputUtil.inputString()))));
            view.print("\n" + newBooksDate.printAllBooks());

            view.print("\nSorted by author: ");
            Books newBooksSortedByAuthor = new Books(books.sortBooksByAuthor());
            view.print("\n" + newBooksSortedByAuthor.printAllBooks());

            view.print("\nSorted by publisher: ");
            Books newBooksSortedByPublisher = new Books(books.sortBooksByPublisher());
            view.print("\n" + newBooksSortedByPublisher.printAllBooks());

            view.print("\nSorted by price DESC: ");
            Books newBooksSortedByPriceDESC = new Books(books.sortBooksByPriceDesc());
            view.print("\n" + newBooksSortedByPriceDESC.printAllBooks());
        }
        catch(ValidationException ve) {
            System.out.println(ve.getMessage());
        }
    }
}
