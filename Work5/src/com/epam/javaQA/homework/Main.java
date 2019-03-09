package com.epam.javaQA.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arrayLength;
        int[] array;
        int[][] matrix;

        while(true) {

            System.out.print("Choose the task: ");
            String task = in.next();

            switch (task) {

                case "1":
                    System.out.print("Write a length of array: ");
                    arrayLength = in.nextInt();
                    array = fillArray(arrayLength);

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
                    array = fillArray(arrayLength);

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

                    matrix = fillThreeArrays(arrayLength);

                    System.out.print("First array: " + Arrays.toString(matrix[0]));
                    System.out.println("Second array: " + Arrays.toString(matrix[1]));
                    System.out.println("Third array: " + Arrays.toString(matrix[2]));
                    break;
                case "4":
                    System.out.print("Write a length of array: ");
                    arrayLength = in.nextInt();

                    matrix = createTwoExtraArrays(arrayLength);

                    System.out.print("First array: " + Arrays.toString(matrix[0]));
                    System.out.println("Second array: " + Arrays.toString(matrix[1]));
                    System.out.println("Third array: " + Arrays.toString(matrix[2]));
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

    private static int[] fillArray(int Length) {

        int[] array = new int[Length];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    private static int[][] fillThreeArrays(int Length) {

        int[] array1 = new int[Length];
        int[] array2 = copyOf(array1, array1.length);
        int[] array3 = copyOf(array1, array1.length);
        int[][] arrayAll = new int[3][];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 10);
        }

        for(int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 10);
        }

        for(int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        arrayAll[0] = array1;
        arrayAll[1] = array2;
        arrayAll[2] = array3;

        return arrayAll;
    }

    private static int[][] createTwoExtraArrays(int Length) {

        int[] array = new int[Length];
        int[] arrayPositive = copyOf(array, array.length);
        int[] arrayNegative = copyOf(array, array.length);
        int[][] arrayAll = new int[3][];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 19) - 9;
        }

        int posIndex = 0;
        int negIndex = 0;
        for(int i : array) {

            if (i >= 0) {
                arrayPositive[posIndex] = i;
                posIndex++;
            } else {
                arrayNegative[negIndex] = i;
                negIndex++;
            }
        }

        arrayPositive = copyOf(arrayPositive, posIndex);
        arrayNegative = copyOf(arrayNegative, negIndex);

        arrayAll[0] = array;
        arrayAll[1] = arrayPositive;
        arrayAll[2] = arrayNegative;

        return arrayAll;
    }
}
