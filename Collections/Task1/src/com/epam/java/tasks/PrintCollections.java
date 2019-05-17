package com.epam.java.tasks;

public class PrintCollections {

    public void printList(int length, int... args) {
        System.out.println(CollectionsInit.getListInt(length, args).toString());
    }

    public void printSet(int length, int... args) {
        System.out.println(CollectionsInit.getSetInt(length, args).toString());
    }
}
