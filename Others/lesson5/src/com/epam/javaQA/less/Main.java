package com.epam.javaQA.less;

public class Main {

    public static void main(String[] args) {

        int size = 10;
        int[] array = createArrayInt(size);

        for(int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + diffMinMax(array));
    }

    private static int[] createArrayInt(int size) {

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }

        return array;
    }

    private static int diffMinMax(int[] array) {

        int min = array[0], max = array[0];

        for(int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        return max - min;
    }
}
