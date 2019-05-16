package com.epam.java.tasks;

import java.util.List;

public class PrintCollections {

    //private List<Integer> integerList =

    public void printList(int length, int... args) {

        /*for(Integer i : CollectionsInit.getListInt(length, args)) {
            System.out.println();
        }*/
        System.out.println(CollectionsInit.getListInt(length, args).toString());
    }

    public void printSet(int length, int... args) {
        System.out.println(CollectionsInit.getSetInt(length, args).toString());
    }
}
