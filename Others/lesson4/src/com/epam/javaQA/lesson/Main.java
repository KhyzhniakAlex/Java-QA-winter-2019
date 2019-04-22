package com.epam.javaQA.lesson;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhoneNumber("Sasha", "380748946123");
        phoneBook.addPhoneNumber("Oleg", "380948946123");
        phoneBook.addPhoneNumber("Andrey", "380848946123");
        phoneBook.addPhoneNumber("Yura", "380148946123");

        System.out.println(phoneBook.printRecords());
        System.out.println(phoneBook.sortByName());
        System.out.println(phoneBook.sortByNumber());
    }
}
