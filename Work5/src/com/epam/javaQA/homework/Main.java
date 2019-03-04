package com.epam.javaQA.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.print("Choose the task: ");
            String task = in.next();

            switch (task) {

                case "1":
                    System.out.print("Write a length of array: ");
                    int arrayLength = in.nextInt();
                    int [] array = printArray(arrayLength);
                    System.out.print("Our array: ");
                    for(int i : array) {
                        System.out.print(i + " ");
                    }
                    System.out.print("\nReverse array: ");
                    for(int i = array.length - 1; i >= 0; i--) {

                        System.out.print(array[i] + " ");
                    }
                    break;
                case "2":
                    System.out.print("Write a length of array: ");
                    arrayLength = in.nextInt();
                    array = printArray(arrayLength);
                    System.out.print("Our array: ");

                    int amount = 0, sum = 0;
                    for(int i : array) {

                        System.out.print(i + " ");
                        if (i % 2 != 0) {

                            amount++;
                            sum += i;
                        }
                    }
                    System.out.printf("\nAmount = %d, Sum = %d", amount, sum);
                    break;
                case "3":
                    System.out.print("Write a length of array: ");
                    arrayLength = in.nextInt();
                    fillThreeArrays(arrayLength);
                    break;
                case "4":
                    System.out.print("Write a length of array: ");
                    arrayLength = in.nextInt();
                    createTwoExtraArrays(arrayLength);
                    break;
                case "5":
                    return;
                default:
                    System.err.println("Invalid typed value");
                    break;
            }
            System.out.println();
        }
    }

    private static int[] printArray(int Length) {

        int[] array = new int[Length];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    private static void fillThreeArrays(int Length) {

        int[] array1 = new int[Length];
        int[] array2 = new int[Length];
        int[] array3 = new int[Length];

        System.out.print("First array: ");
        for(int i = 0; i < array1.length; i++) {

            array1[i] = (int)(Math.random() * 10);
            System.out.print(array1[i] + " ");
        }

        System.out.print("\nSecond array: ");
        for(int i = 0; i < array2.length; i++) {

            array2[i] = (int)(Math.random() * 10);
            System.out.print(array2[i] + " ");
        }

        System.out.print("\nThird array: ");
        for(int i = 0; i < array3.length; i++) {

            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i] + " ");
        }
    }

    private static void createTwoExtraArrays(int Length) {

        int[] array = new int[Length];
        List<Integer> listPositive = new ArrayList<>();
        List<Integer> listNegative = new ArrayList<>();

        System.out.print("First array: ");
        for(int i = 0; i < array.length; i++) {

            array[i] = (int)(Math.random() * 19) - 9;
            System.out.print(array[i] + " ");
        }

        for(int i : array) {

            if (i >= 0) listPositive.add(i);
            else listNegative.add(i);
        }

        System.out.print("\nPositive array: ");
        for(int i : listPositive) {
            System.out.print(i + " ");
        }

        System.out.print("\nNegative array: ");
        for(int i : listNegative) {
            System.out.print(i + " ");
        }
    }
}
