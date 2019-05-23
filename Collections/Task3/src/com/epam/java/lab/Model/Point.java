package com.epam.java.lab.Model;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Point p = (Point)obj;
        if (this.x != p.x)
            return false;
        else
            return this.y == p.y;
    }

    @Override
    public int hashCode() {
        int result = 5;
        long forX = Double.doubleToLongBits(x);
        long forY = Double.doubleToLongBits(y);
        result = 31 * result + (int)(forX^(forX>>>32));
        result = 31 * result + (int)(forY^(forY>>>32));
        return result;
    }
}
