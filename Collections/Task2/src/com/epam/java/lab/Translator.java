package com.epam.java.lab;

public class Translator {

    private static Dictionary dictionary = new Dictionary();

    public String putIntoDictionary(String pair) throws ArrayIndexOutOfBoundsException {
        String[] couple = pair.split(", ");
        return dictionary.addPair(couple[0], couple[1]);
    }

    public String translatePhrase(String eng) {
        return dictionary.translate(eng);
    }
}
