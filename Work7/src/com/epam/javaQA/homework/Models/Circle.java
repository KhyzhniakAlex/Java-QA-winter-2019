package com.epam.javaQA.homework.Models;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) throws Exception {
        super(color);
        if (radius <= 0)
            throw new Exception("Invalid radius");
        else
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
         return String.format("%s, radius = %.2f", super.toString(), this.radius);
    }
}
