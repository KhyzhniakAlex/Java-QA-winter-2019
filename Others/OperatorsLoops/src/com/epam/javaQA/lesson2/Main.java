package com.epam.javaQA.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String methodNumber = in.next();

        if (methodNumber == "1")
        {
            String loopNumber = in.next();
            DoLoop(loopNumber);
        }
        else if (methodNumber == "2")
        {
            Random random = new Random();
            System.out.println(DoBool(random.nextInt(5)));
        }
        else
        {
            DoSeconds();
        }
    }

    private static void DoSeconds()
    {
        long seconds = System.currentTimeMillis() / 1000;

        int days = (int)(seconds / (60*24*60));

        int weeks = days / 7;

        int months = weeks / 30;

        int years = months / 12;

        //System.out.println(days);
        System.out.println("years = " + years + ", months = " + months + ", weeks = " + weeks + ", days = " + days);
    }

    private static String DoBool(int random)
    {
        boolean A = true;
        boolean B = false;
        boolean C = random == 0;

        if ((A || B) && (A && C)) return "It's really true";
        return "Sorry, not your day";
    }

    private static void DoLoop(String number)
    {
        switch(number)
        {
            case "1":
                long value = 23L;

                System.out.println(value == 58 ? "statement if" : "not statement if");
                break;
            case "2":

                for(int i = 0; i < 5; i++)
                    System.out.println("loop FOR: " + i);
                break;
            case "3":
                int whileValue = 0;

                while(whileValue++ < 5)
                    System.out.println("loop WHILE: " + whileValue);
                break;
            default:
                int doWhileValue = 0;

                do System.out.println("loop DoWhile: " + doWhileValue);
                while(doWhileValue++ < 5);
                break;
        }
    }
}
