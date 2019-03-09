package com.epam.javaQA.lesson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = getArray();
        System.out.println(sum(array));
        printArray(array);
    }

    private static int[][] getArray() {

        return new int[][] {{1,2,3,4,5}, {5,4,3,2,1}, {1,4,7,2,5}};
    }

    private static int sum(int[][] array) {

        int sum = 0;
        for(int[] line : array) {
            for(int i : line) {
                sum += i;
            }
        }

        return sum;
    }

    private static void printArray(int[][] array) {

        for(int[] line : array) {
            System.out.println(Arrays.toString(line));
        }
    }
}
