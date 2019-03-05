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
                    System.out.println(divideOnChar());
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

            int temp;
            String result = "";
            while (number != 0) {

                temp = number % 2;
                result = temp + result;
                number /= 2;
            }

            return result;
        }
        catch(Exception e) {
            System.err.println("Invalid typed value");
        }
        return "";
    }

    private static String divideOnChar() {

        Scanner in = new Scanner(System.in);
        System.out.print("Write a string: ");
        String str = in.nextLine();

        String result = "";
        int i = 0;
        while(i < str.length()) {

            char ch = str.charAt(i);
            int j = 0;
            boolean check = true;
            while(j < str.length()) {

                if (ch == str.charAt(j) && i != j) check = false;
                j++;
            }
            if (check) result += ch;
            i++;
        }

        return result;
    }
}

