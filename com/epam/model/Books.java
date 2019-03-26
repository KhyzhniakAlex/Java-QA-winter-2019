package com.epam.model;

public class Books {
    private int count = 0;
    private Book[] library;

    public Books(int arraySize) {
        this.library = new Book[arraySize];
    }

    public boolean addBook(Book book) {
        if (count >= library.length) {
            return false;
        }
        library[count++] = book;
        return true;
    }

    public String viewBooks() {
        if (count == 0) {
            return "No books!";
        }
        String books = "";
        for(int i=0; i<count; i++) {
            books += library[i].viewBook();
            books += "\n";
        }
        return books;
    }

    public void changePrice(float percent) {
        System.out.println("Change price by "
                + percent  + "%");
        for(int i=0; i<count; i++) {
            library[i].changePrice(percent);
        }
    }

    public Books findBookByAuthor(String author) {
        Books newBooks = new Books(count);
        for(int i=0; i<count; i++) {
            if(library[i].getAuthor().equalsIgnoreCase(author)) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }

}
