package com.epam.javaQA.lesson;

public class Main {

    public static void main(String[] args) {

        String str1 = "abcdefg";
        String str2 = "atcyejg";

        System.out.println(takeSameChars(str1, str2));
    }

    private static String takeSameChars(String str1, String str2) {

        String same = "";

        for(int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == str2.charAt(i)) same += str1.charAt(i);
        }

        return same;
    }
}
