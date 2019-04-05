package com.epam.javaQA.homework.Comparators;

import com.epam.javaQA.homework.Models.Shape;

import java.util.Comparator;

public class CompareShapeByArea implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        return (int)(((Shape)obj1).calcArea() - ((Shape)obj2).calcArea());
    }
}
