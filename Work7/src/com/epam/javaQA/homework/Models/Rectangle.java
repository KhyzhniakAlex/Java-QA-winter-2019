package com.epam.javaQA.homework.Models;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(String color, double height, double width) throws Exception {
        super(color);
        if (height <= 0)
            throw new Exception("Invalid height");
        else if (width <= 0)
            throw new Exception("Invalid width");
        else {
            this.height = height;
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return String.format("%s, height = %.2f, width = %.2f", super.toString(), this.height, this.width);
    }
}
