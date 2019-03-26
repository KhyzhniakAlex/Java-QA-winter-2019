package com.epam.javaQA.homework;

import java.util.Scanner;

public class InputUtil {

    private static Scanner in;

    public static int inputInt() {

        int result;
        while(true) {
            in = new Scanner(System.in);
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

    public static double inputDouble() {

        double result;
        while(true) {
            in = new Scanner(System.in);
            try {
                result = in.nextDouble();
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid typed value");
                System.out.print("Enter value again: ");
            }
        }

        return result;
    }

    public static String inputString() {
        //in.nextLine();
        /*String str = in.nextLine();
        in.nextLine();
        return str;*/
        return in.next();
    }
}
