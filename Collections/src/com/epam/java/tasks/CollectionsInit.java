package com.epam.java.tasks;

import java.util.*;

public class CollectionsInit {

    private static List<Integer> listInt;
    private static Set<Integer> setInt;

    public static List<Integer> getListInt(int length, int... args) {
        listInt = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (args.length < i)
                listInt.add(0);
            else
                listInt.add(args[i]);
        }
        return listInt;
    }

    public static Set<Integer> getSetInt(int length, int... args) {
        setInt = new HashSet<>();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            if (setInt.contains(args[i]))
                length++;
            else if (args.length < i)
                setInt.add(rnd.nextInt(100) - 99);
            else
                setInt.add(args[i]);
        }
        return setInt;
    }
}
