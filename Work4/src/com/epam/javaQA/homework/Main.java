package com.epam.javaQA.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.print("Choose the task: ");
            String task = in.next();

            if (task.equals("1"))
            {
                System.out.println(TurnIntoBinary());
            }
            else if (task.equals("2"))
            {
                char[] gained = DivideOnChar();
                for(char letter : gained)
                {
                    System.out.print(letter + " ");
                }
                System.out.println();
            }
            else if (task.equals("3")) return;
            else System.err.println("Invalid typed value");
            System.out.println();
        }
    }

    private static String TurnIntoBinary()
    {
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

    private static char[] DivideOnChar()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Write a string: ");
        String str = in.next();

        return str.toCharArray();
    }
}
