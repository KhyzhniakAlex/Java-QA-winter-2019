package com.epam.javaQA.homework.Controller;

import com.epam.javaQA.homework.InputUtil;
import com.epam.javaQA.homework.Model.Book;
import com.epam.javaQA.homework.Model.Books;
import com.epam.javaQA.homework.View.ViewBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    private Books books;
    private ViewBook view = new ViewBook();

    public void run() throws ParseException {
        view.print("Enter size: ");
        int length = InputUtil.inputInt();
        books = new Books(length);

        view.print("\nEnter information about a book: ");
        createBooks(length);
        view.print("\n" + books.printAllBooks());

        view.print("\nEnter percent: ");
        books.changePrice(true, InputUtil.inputDouble());
        view.print("\n" + books.printAllBooks());

        view.print("\nChoose an author: ");
        Books newBooksAuthor = new Books(books.findAllAuthorBooks(InputUtil.inputString()));
        view.print("\n" + newBooksAuthor.printAllBooks());

        view.print("\nWrite a date (yyyy): ");
        Books newBooksDate = new Books(books.findAllBooksAfterDate(format.parse(InputUtil.inputString())));
        view.print("\n" + newBooksDate.printAllBooks());
    }

    private void createBooks(int iterations) throws ParseException {

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
