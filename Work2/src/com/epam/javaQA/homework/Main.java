package com.epam.javaQA.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.print("Put the number of command: ");
            String command = in.next();
            switch(command)
            {
                case "1":
                    ChangeValue();
                    break;
                case "2":
                    DifferenceWithReverse();
                    break;
                case "3":
                    GetWeight();
                    break;
                case "4":
                    GetDeposit();
                    break;
                case "5":
                    return;
                default:
                    System.err.println("Invalid number of command");
                    break;
            }
            System.out.println();
        }
    }

    private static void ChangeValue()
    {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("First value: ");
            int value1 = in.nextInt();
            System.out.print("Second value: ");
            int value2 = in.nextInt();

            value1 += value2;
            value2 = value1 - value2;
            value1 -= value2;

            System.out.println("Our values: " + value1 + ", " + value2);
        }
        catch(Exception e) {
            System.err.println("Invalid typed value");
        }
    }

    private static void DifferenceWithReverse()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Write an integer value with 3 symbols: ");
        String number = in.next();
        if (number.length() != 3)
        {
            System.err.println("Invalid typed value");
            return;
        }

        try {
            int value1 = Integer.parseInt(number);

            if (value1 < 0) {
                number = number.substring(1);
                number += "-";
            }
            int len = number.length();
            for (int i = len-1; i >= 0; i--)
                number += number.charAt(i);
            number = number.substring(len);

            int value2 = Integer.parseInt(number);
            System.out.println("Our difference: " + (value1 - value2));
        }
        catch(Exception e){
            System.err.println("Invalid typed value");
        }
    }

    private static void GetWeight()
    {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Write the number of lb.: ");
            double lb = in.nextDouble();

            double kg = lb * 0.4536;

            int kgOut = (int)kg;
            double grams = (kg - kgOut) * 100.0;
            System.out.println("Kilograms = " + kgOut + ", grams = " + grams);
        }
        catch (Exception e){
            System.err.println("Invalid typed value");
        }
    }

    private static void GetDeposit()
    {
        try{
            Scanner in = new Scanner(System.in);

            System.out.print("Write the size of deposit: ");
            double deposit = in.nextDouble();
            System.out.print("Write the number of months: ");
            int months = in.nextInt();

            int percentYear = 12;
            double profit = (deposit * percentYear * months) / (12 * 100);

            System.out.println(deposit + profit);
        }
        catch(Exception e)
        {
            System.err.println("Invalid typed value");
        }
    }
}
