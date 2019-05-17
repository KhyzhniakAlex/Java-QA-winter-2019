package com.epam.java.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PrintCollections pc = new PrintCollections();
        int length = typeLength();
        int[] array = typeArray();

        pc.printList(length, array);
        pc.printSet(length, array);
    }

    private static int[] typeArray() {

        List<Integer> args = new ArrayList<>();

        System.out.println("Write an array, using ',': ");
        String input = new Scanner(System.in).nextLine();
        String[] inputArray = input.split(",");

        for (String word : inputArray) {
            if (word.replaceAll("[0-9]", "").length() == 0) {
                args.add(Integer.parseInt(word));
            }
        }

        int[] array = new int[args.size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = args.get(i);
        }
        return array;
    }

    private static int typeLength() {

        System.out.print("\nPrint length: ");
        String input = new Scanner(System.in).next();
        int length = 0;
        if (input.replaceAll("[0-9]", "").length() == 0) {
            length = Integer.parseInt(input);
            if (length <= 0) {
                System.out.println("Invalid length");
                typeLength();
            }
        }
        else {
            System.out.println("Invalid length. Try again:");
            typeLength();
        }

        return length;
    }
}
