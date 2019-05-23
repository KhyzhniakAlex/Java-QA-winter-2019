package com.epam.java.lab.Model;

import com.epam.java.lab.Exception.SideException;

public class Triangle {

    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Point getA() {
        return A;
    }
    public Point getB() {
        return B;
    }
    public Point getC() {
        return C;
    }

    public static void checkCondition(Point a, Point b, Point c) throws SideException {
        double[] sides = getSides(a, b, c);
        if ((sides[0] >= sides[1] + sides[2] && sides[1] >= sides[0] + sides[2] && sides[2] >= sides[0] + sides[1]))
            throw new SideException("Invalid coordinates");
    }

    private static double calculateSide(Point first, Point second) {
        return Math.sqrt(Math.pow((second.getX() - first.getX()), 2) + Math.pow((second.getY() - first.getY()), 2));
    }

    public static double[] getSides(Point a, Point b, Point c) {
        double d1 = calculateSide(a, b);
        double d2 = calculateSide(b, c);
        double d3 = calculateSide(a,c);

        return new double[]{d1, d2, d3};
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Triangle triangle = (Triangle)obj;
        return (this.A.equals(triangle.A)) && (this.B.equals(triangle.B)) && (this.C.equals(triangle.C));
    }

    @Override
    public int hashCode() {
        int result = 10;
        result = 31 * result + A.hashCode();
        result = 31 * result + B.hashCode();
        result = 31 * result + C.hashCode();
        return result;
    }
}
