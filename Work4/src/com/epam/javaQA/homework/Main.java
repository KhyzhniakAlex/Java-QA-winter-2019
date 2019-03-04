package com.epam.javaQA.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.print("Choose the task: ");
            String task = in.next();

            switch (task) {
                case "1":
                    System.out.println(turnIntoBinary());
                    break;
                case "2":
                    char[] gained = divideOnChar();
                    for (char letter : gained) {

                        System.out.print(letter + " ");
                    }
                    System.out.println();
                    break;
                case "3":
                    return;
                default:
                    System.err.println("Invalid typed value");
                    break;
            }
            System.out.println();
        }
    }

    private static String turnIntoBinary() {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Write a integer: ");
            int number = in.nextInt();
            if(number < 0) number = -number;

            return Integer.toString(number, 2);
        }
        catch(Exception e) {
            System.err.println("Invalid typed value");
        }
        return "";
    }

    private static char[] divideOnChar() {

        Scanner in = new Scanner(System.in);
        System.out.print("Write a string: ");
        String str = in.next();

        return str.toCharArray();
    }
}
