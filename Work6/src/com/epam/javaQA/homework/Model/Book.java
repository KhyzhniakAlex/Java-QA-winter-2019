package com.epam.javaQA.homework.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");
    private static int idAuto = 1;

    private int ID;
    private String name;
    private String author;
    private String publisher;
    private Date releaseYear;
    private int pageAmount;
    private double price;

    public Book(String name, String author, String publisher, Date releaseYear, int pageAmount, double price) {

        this();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.pageAmount = pageAmount;
        this.price = price;
    }

    public Book() {
        this.ID = idAuto++;
    }

    public int getID() {
        return ID;
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


    public String view() {
        return String.format("Book №%d: {%n - %s;%n - %s;%n - %s;%n - %s year;%n - %d pages;%n - %.2f grn%n}\n",
                this.getID(),
                this.getName(),
                this.getAuthor(),
                this.getPublisher(),
                format.format(this.getReleaseYear()),
                this.getPageAmount(),
                this.getPrice()
        );
    }

    public void changePrice(boolean whatToChange, double percent) {

        if (whatToChange)
            this.setPrice((this.getPrice() * percent / 100) + this.getPrice());
        else
            this.setPrice(this.getPrice() - (this.getPrice() * percent / 100));
    }
}
