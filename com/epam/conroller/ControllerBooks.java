package com.epam.conroller;

import com.epam.model.Books;
import com.epam.view.ViewBooks;

public class ControllerBooks {
    private Books books;
    private ViewBooks viewBooks = new ViewBooks();

    public void run() {
        viewBooks.print("Enter size -> ");
        books = new Books(InputUtil.inputInt());
        // create
        viewBooks.print(books.viewBooks());

        viewBooks.print("\nEnter percent -> ");
        books.changePrice(InputUtil.inputInt());
        viewBooks.print(books.viewBooks());

        Books nBooks = books.findBookByAuthor("");
        viewBooks.print(nBooks.viewBooks());
    }
}
