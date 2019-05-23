package com.epam.java.tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PrintCollections pc = new PrintCollections();

        System.out.print("Print length: ");
        int length = typeNumber();

        System.out.print("Print range: ");
        int range = typeNumber();

        pc.printList(length, range);
        pc.printSet(length, range);
    }

    private static int typeNumber() {

        String input = new Scanner(System.in).next();
        int number = 0;
        if (input.replaceAll("[0-9]", "").length() == 0) {
            number = Integer.parseInt(input);
            if (number <= 0) {
                System.out.println("Invalid length");
                typeNumber();
            }
        } else {
            System.out.println("Invalid number. Try again:");
            typeNumber();
        }

        return number;
    }
}
