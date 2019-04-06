package com.epam.javaQA.homework.Models;

import com.epam.javaQA.homework.Interfaces.Drawable;

public abstract class Shape implements Drawable {

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

    public abstract double calcArea();

    @Override
    public String toString() {
        return "CLASS = " + this.getClass().getSimpleName() + ", COLOR = " + color;
    }

    @Override
    public void drawShape() {
        System.out.printf(this + ", AREA = %.2f\n", this.calcArea());
    }
}
