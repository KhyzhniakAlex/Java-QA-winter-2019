package com.epam.javaQA.homework;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.print("Choose the task: ");
            String task = in.next();

            switch(task) {

                case "1":
                    try {
                        System.out.print("Write the length of array: ");
                        int arrayLength = in.nextInt();

                        int[] array = fillArray(arrayLength);

                        System.out.println("Our array: " + Arrays.toString(array));

                        System.out.println(countAverage(array));
                    }
                    catch (Exception e) {
                        System.out.println("Invalid typed value");
                    }
                    break;
                case "2":
                    try {
                        System.out.print("Write the length of first array: ");
                        int arrayLength1 = in.nextInt();

                        System.out.print("Write the length of second array: ");
                        int arrayLength2 = in.nextInt();

                        int[][] matrix = concatArrays(arrayLength1, arrayLength2);

                        System.out.println("First array: " + Arrays.toString(matrix[0]));
                        System.out.println("Second array: " + Arrays.toString(matrix[1]));
                        System.out.println("Third array: " + Arrays.toString(matrix[2]));
                    }
                    catch(Exception e) {
                        System.out.println("Invalid typed value");
                    }
                    break;
                case "3":
                    try {
                        System.out.print("Write the length of array: ");
                        int arrayLength = in.nextInt();

                        int[] array = fillArray(arrayLength);

                        System.out.println("Our array: " + Arrays.toString(array));

                        System.out.println("Changed array: " + Arrays.toString(deleteMinMax(array)));
                    }
                    catch (Exception e) {
                        System.out.println("Invalid typed value");
                    }
                    break;
                case "4":
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
            array[i] = (int)(Math.random() * 19) - 9;
        }
        return array;
    }

    private static String countAverage(int[] array) {

        double average = 0;
        for(int i : array) {
            average += i;
        }

        average /= array.length;

        int amount = 0;
        for(int i : array) {
            if (i > average) amount++;
        }

        return "\nAverage = " + average + ", More than average = " + amount;
    }

    private static int[][] concatArrays(int Length1, int Length2) {

        int[] array1 = new int[Length1];
        int[] array2 = new int[Length2];
        int[] array3 = new int[Length1 + Length2];
        int[][] arrayAll = new int [3][0];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 19) - 9;
        }

        for(int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 19) - 9;
        }

        //System.arraycopy(array1, 0, array3, 0, array1.length);
        //System.arraycopy(array2, 0, array3, array1.length, array2.length);

        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for(int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }

        arrayAll[0] = array1;
        arrayAll[1] = array2;
        arrayAll[2] = array3;

        return arrayAll;
    }

    private static int[] deleteMinMax(int[] array) {

        int min = array[0];
        int max = array[0];

        for(int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        //deleting min element
        int j;
        int Length = array.length;
        for(j = 0; j < Length; j++) {
            if (array[j] == min) break;
        }
        for(int k = j; k < Length - 1; k++) {
            array[k] = array[k+1];
        }
        array = Arrays.copyOf(array, --Length);


        //deleting max element
        Length = array.length;
        for(j = 0; j < Length; j++) {
            if (array[j] == max) break;
        }
        for(int k = j; k < Length - 1; k++) {
            array[k] = array[k+1];
        }
        array = Arrays.copyOf(array, --Length);

        return array;
    }
}
