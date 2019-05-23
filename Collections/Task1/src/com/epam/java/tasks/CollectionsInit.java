package com.epam.java.tasks;

import java.util.*;

public class CollectionsInit {

    public static List<Integer> getListInt(int length, int range) {
        List<Integer> listInt = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            listInt.add(rnd.nextInt(range));
        }
        return listInt;
    }

    public static Set<Integer> getSetInt(int length, int range) {
        Set<Integer> setInt = new HashSet<>();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            int number = rnd.nextInt(range);
            if (setInt.contains(number))
                length++;
            else {
                setInt.add(number);
            }
        }
        return setInt;
    }
}
