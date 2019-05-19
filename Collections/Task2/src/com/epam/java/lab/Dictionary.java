package com.epam.java.lab;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public String addPair(String english, String russian) {

        if (dictionary.containsKey(english))
            return " - This english word is already exist";
        else {
            dictionary.put(english, russian);
            return " - The pair of words is added";
        }
    }

    public String translate(String englishPhrase) {

        String[] words = englishPhrase.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char[] letters = word.toCharArray();
            if (letters[letters.length-1] == ',') {
                String[] str = word.split(",");
                sb.append(dictionary.getOrDefault(str[0], word)).append(",").append(" ");
            }
            else
                sb.append(dictionary.getOrDefault(word, word)).append(" ");
        }

        return sb.toString();
    }
}
