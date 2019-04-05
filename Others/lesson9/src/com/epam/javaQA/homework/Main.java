package com.epam.javaQA.homework;

public class Main {

    public static void main(String[] args) {

        Device dev = new Device("HYEJ89", "Sony", 1000);
        Device dev1 = new Device("HYEJ89", "Sony", 1000);

        System.out.println(dev);
        System.out.println(dev1);

        Monitor mon = new Monitor("lkdvl", "aa", 5865, 8.4, 4.9);
        Monitor mon1 = new Monitor("asfs", "aa", 7268, 8.4, 4.9);

        System.out.println(mon);

        System.out.println(dev.equals(dev1));

        System.out.println(dev.hashCode() + " & " + dev1.hashCode());
    }
}
