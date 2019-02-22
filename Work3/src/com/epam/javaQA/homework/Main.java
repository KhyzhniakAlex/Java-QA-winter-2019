package com.epam.javaQA.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.print("Put a number of picture: ");
            String triangle = in.next();
            if (triangle.equals("1")) DrawTriangle1();
            else if (triangle.equals("2")) DrawTriangle2();
            else if (triangle.equals("3")) DrawTriangle3();
            else if (triangle.equals("4")) DrawTriangle4();
            else if (triangle.equals("5")) DrawTriangle5();
            else if (triangle.equals("6")) return;
            else System.err.println("Invalid typed value");
            System.out.println();
        }
    }

    private static void DrawTriangle1()
    {
        int forStars = 1;
        for (int i = 0; i < 4; i++)
        {
            int iter = 0;
            while(iter < forStars)
            {
                System.out.print("*");
                iter++;
            }
            System.out.println();
            if (i != 3) forStars += 2;
        }

        for (int i = 0; i < 3; i++)
        {
            forStars -= 2;
            int iter = 0;
            while(iter < forStars)
            {
                System.out.print("*");
                iter++;
            }
            System.out.println();
        }
    }

    private static void DrawTriangle2()
    {
        int forStars = 7;
        int forSpace = 0;
        int j = 4;
        DrawRightUpTriangle(forSpace, forStars, j);
    }

    private static void DrawTriangle3()
    {
        int forStars = 1;
        int forSpace = 6;
        int j = 4;
        DrawRightDownTriangle(forSpace, forStars, j);
    }

    private static void DrawTriangle4()
    {
        int forStars = 1;
        int forSpace = 6;
        int j = 4;
        DrawRightDownTriangle(forSpace, forStars, j);

        forStars = 5;
        forSpace = 2;
        int k = 3;
        DrawRightUpTriangle(forSpace, forStars, k);
    }

    private static void DrawTriangle5()
    {
        for (int i = 0; i < 2; i++)
        {
            int forSpace = 6;
            int forStars = 1;
            for (int j = 0; j < 4; j++)
            {
                int iter1 = 0;
                while(iter1 < forSpace)
                {
                    System.out.print(" ");
                    iter1++;
                }

                int iter2 = 0;
                while(iter2 < forStars)
                {
                    System.out.print("*");
                    iter2++;
                }

                System.out.println();
                forSpace -= 2;
                forStars += 4;
            }
        }
    }

    private static void DrawRightDownTriangle(int forSpace, int forStars, int j)
    {
        for (int i = 0; i < j; i++)
        {
            int iter1 = 0;
            while(iter1 < forSpace)
            {
                System.out.print(" ");
                iter1++;
            }

            int iter2 = 0;
            while(iter2 < forStars)
            {
                System.out.print("*");
                iter2++;
            }

            System.out.println();
            forSpace -= 2;
            forStars += 2;
        }
    }

    private static void DrawRightUpTriangle(int forSpace, int forStars, int j)
    {
        for (int i = 0; i < j; i++)
        {
            int iter1 = 0;
            while(iter1 < forSpace)
            {
                System.out.print(" ");
                iter1++;
            }

            int iter2 = 0;
            while(iter2 < forStars)
            {
                System.out.print("*");
                iter2++;
            }

            System.out.println();
            forSpace += 2;
            forStars -= 2;
        }
    }
}
