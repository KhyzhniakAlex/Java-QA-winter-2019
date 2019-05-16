package com.epam.java.tasks;

import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        PrintCollections pc = new PrintCollections();
        int length = typeLength();

        pc.printList(length, typeArray(length));
        pc.printSet(length, typeArray(length));
    }

    private static int[] typeArray(int length) {

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = typeNumber();
        }
        return array;
    }

    private static int typeLength() {
        System.out.print("Print length: ");
        int length = typeNumber();

        if (length <= 0) {
            System.out.println("Invalid length");
            typeLength();
        }
        return length;
    }

    private static int typeNumber() {

        int result;
        while(true) {
            try {
                result = in.nextInt();
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid typed value");
                System.out.print("Enter value again: ");
            }
        }
        return result;
    }
}
