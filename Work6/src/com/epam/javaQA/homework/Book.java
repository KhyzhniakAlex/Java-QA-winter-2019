package com.epam.javaQA.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    private int ID;
    private String name;
    private String author;
    private String publisher;
    private Date releaseYear;
    private int pageAmount;
    private double price;

    public Book(int ID, String name, String author, String publisher, Date releaseYear, int pageAmount, double price) {

        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.pageAmount = pageAmount;
        this.price = price;
    }

    public Book() {}

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPageAmount() {
        return pageAmount;
    }
    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public void view() {

        System.out.printf("Book №%d: {%n - %s;%n - %s;%n - %s;%n - %s year;%n - %d pages;%n - %.2f grn%n}\n",
                this.getID(),
                this.getName(),
                this.getAuthor(),
                this.getPublisher(),
                format.format(this.getReleaseYear()),
                this.getPageAmount(),
                this.getPrice()
        );
    }
}
