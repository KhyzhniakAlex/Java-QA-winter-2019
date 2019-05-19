package com.epam.java.lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Write words for dictionary: ");
        Translator translator = new Translator();

        while(true) {
            try {
                String pair = in.nextLine();
                if (pair.equals("exit"))
                    break;
                else
                    System.out.println(translator.putIntoDictionary(pair));
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid pair");
            }
        }

        System.out.println("Write a phrase for translation: ");
        System.out.println(translator.translatePhrase(in.nextLine()));
    }
}
