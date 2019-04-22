package com.epam.javaQA.homework.Service;

import java.util.Scanner;

public class InputUtil {

    public static int inputInt() {

        int result;
        while(true) {
            try {
                result = new Scanner(System.in).nextInt();
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
            try {
                result = new Scanner(System.in).nextDouble();
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
        return new Scanner(System.in).next();
    }
}
