package com.epam.javaQA.homework.Models;

public class Triangle extends Shape {

    private double A;
    private double B;
    private double C;

    public Triangle(String color, double A, double B, double C) throws Exception {
        super(color);
        if (A <= 0)
            throw new Exception("Invalid A");
        else if (B <= 0)
            throw new Exception("Invalid B");
        else if (C <= 0)
            throw new Exception("Invalid C");
        else if (A + B <= C || B + C <= A || A + C <= B)
            throw new Exception("Two sides are not more, than the third one");
        else {
            this.A = A;
            this.B = B;
            this.C = C;
        }
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    @Override
    public double calcArea() {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

    @Override
    public String toString() {
        return super.toString() + ", area = " + calcArea();
    }
}
