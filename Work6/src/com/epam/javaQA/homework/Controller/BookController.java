package com.epam.javaQA.homework.Controller;

import com.epam.javaQA.homework.Exceptions.ValidationException;
import com.epam.javaQA.homework.FileWorking.IntermediateFile;
import com.epam.javaQA.homework.FileWorking.LoadSaveFile;
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
        LoadSaveFile lsFile = new LoadSaveFile(".\\src\\com\\epam\\javaQA\\homework\\books.txt");
        IntermediateFile intermediateFile = new IntermediateFile(".\\src\\com\\epam\\javaQA\\homework\\intermediateInfo.txt");

        try {
            books = new Books(lsFile.countBooks());

            lsFile.loadBooks(books);
            view.print("\n" + books.printAllBooks());

            view.print("\nEnter percent: ");
            books.changePrice(true, validator.checkDigit(InputUtil.inputDouble()));
            view.print("\n" + books.printAllBooks());
            intermediateFile.saveIntermediateInfo(books, "Changed price");

            view.print("\nChoose an author: ");
            Books booksAuthor = new Books(books.findAllAuthorBooks(validator.checkText(InputUtil.inputString(), "Author")));
            view.print("\n" + booksAuthor.printAllBooks());
            intermediateFile.saveIntermediateInfo(booksAuthor, "Certain author");

            view.print("\nWrite a after date (yyyy): ");
            Books booksAfterDate = new Books(books.findAllBooksAfterDate(format.parse(validator.checkDate(InputUtil.inputString()))));
            view.print("\n" + booksAfterDate.printAllBooks());
            intermediateFile.saveIntermediateInfo(booksAfterDate, "Books after date");

            view.print("\nSorted by author: ");
            Books booksSortedByAuthor = new Books(books.sortBooksByAuthor());
            view.print("\n" + booksSortedByAuthor.printAllBooks());
            intermediateFile.saveIntermediateInfo(booksSortedByAuthor, "Sorted by author");

            view.print("\nSorted by publisher: ");
            Books booksSortedByPublisher = new Books(books.sortBooksByPublisher());
            view.print("\n" + booksSortedByPublisher.printAllBooks());
            intermediateFile.saveIntermediateInfo(booksSortedByPublisher, "Sorted by publisher");

            view.print("\nSorted by price DESC: ");
            Books booksSortedByPriceDESC = new Books(books.sortBooksByPriceDesc());
            view.print("\n" + booksSortedByPriceDESC.printAllBooks());
            intermediateFile.saveIntermediateInfo(booksSortedByPriceDESC, "Sorted by price DESC");

            lsFile.saveBooks(books);
        }
        catch(ValidationException ve) {
            System.out.println(ve.getMessage());
        }
    }
}
