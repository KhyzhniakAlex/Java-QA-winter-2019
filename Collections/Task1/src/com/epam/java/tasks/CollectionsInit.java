package com.epam.java.tasks;

import java.util.*;

public class CollectionsInit {

    private static List<Integer> listInt;
    private static Set<Integer> setInt;

    public static List<Integer> getListInt(int length, int... args) {
        listInt = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (i >= args.length)
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
            if (i < args.length && setInt.contains(args[i]))
                length++;
            else if (i >= args.length) {
                int res = rnd.nextInt(100) - 99;
                if (setInt.contains(res))
                    length++;
                else
                    setInt.add(res);
            }
            else
                setInt.add(args[i]);
        }
        return setInt;
    }
}
