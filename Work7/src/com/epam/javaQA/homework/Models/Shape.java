package com.epam.javaQA.homework.Models;

import java.util.Arrays;

public class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getName().substring(32) + ", color = " + color;
    }
}
