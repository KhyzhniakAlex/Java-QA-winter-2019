package com.epam.java.tasks;

public class PrintCollections {

    public void printList(int length, int range) {
        System.out.println(CollectionsInit.getListInt(length, range).toString());
    }

    public void printSet(int length, int range) {
        System.out.println(CollectionsInit.getSetInt(length, range).toString());
    }
}
