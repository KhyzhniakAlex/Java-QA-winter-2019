package com.epam.javaQA.homework.Comparators;

import com.epam.javaQA.homework.Models.Shape;

import java.util.Comparator;

public class CompareShapeByColor implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {

        String color1 = ((Shape)obj1).getColor();
        String color2 = ((Shape)obj2).getColor();
        return color1.compareTo(color2);
    }
}
