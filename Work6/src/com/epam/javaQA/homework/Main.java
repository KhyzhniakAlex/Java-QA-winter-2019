package com.epam.javaQA.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Scanner in = new Scanner(System.in);

        Books books = new Books(4);

        books.addBook(new Book(1, "The One from a forest", "Someone", "ЭКСМО", format.parse("2015"), 250, 130));
        books.addBook(new Book(2, "451 Fahrenheit", "Someone", "Something", format.parse("2008"), 421, 300));
        books.addBook(new Book(3, "Bukvar", "People", "All", format.parse("1950"), 37, 45));
        books.addBook(new Book(4, "Metro 2033", "Dmitriy Glukhovskiy", "ЭКСМО", format.parse("2007"), 750, 350));

        System.out.println("All books:");
        books.printAllBooks();

        while(true) {

            System.out.print("\nChoose a task: ");
            String task = in.next();

            switch(task) {

                case "price":
                    try {
                        System.out.print("\nWrite a percent: ");
                        double percent = in.nextDouble();
                        books.changePrice(true, percent);
                        books.printAllBooks();
                    }
                    catch(Exception e) {
                        System.out.println("Invalid typed value");
                    }
                    break;
                case "author":
                    System.out.print("\nWrite an author: ");
                    in.nextLine();
                    String author = in.nextLine();
                    boolean notEmpty = false;
                    for(Book b : books.findAllAuthorBooks(author)) {
                        if (b != null) {
                            b.view();
                            notEmpty = true;
                        }
                    }
                    if (!notEmpty) System.out.println("No book is written by this author");
                    break;
                case "date":
                    System.out.print("\nWrite an date (yyyy): ");
                    String dateString = in.next();
                    Date date = format.parse(dateString);
                    notEmpty = false;
                    for(Book b : books.findAllBooksAfterDate(date)) {
                        if (b != null) {
                            b.view();
                            notEmpty = true;
                        }
                    }
                    if (!notEmpty) System.out.println("No book is written after this date");
                    break;
                default:
                    System.out.println("Here is no such task");
                    break;
            }
        }
    }
}
