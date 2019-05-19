package com.epam.java.lab.Model;

import com.epam.java.lab.Exception.SideException;

public class Triangle {

    private Point A;
    private Point B;
    private Point C;

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) throws SideException {
        A = new Point(xA, yA);
        B = new Point(xB, yB);
        C = new Point(xC, yC);

        if (!checkCondition())
            throw new SideException("Invalid sides");
    }

    private boolean checkCondition() {
        double[] sides = getSides();
        return !(sides[0] >= sides[1] + sides[2]) &&
                !(sides[1] >= sides[0] + sides[2]) &&
                !(sides[2] >= sides[0] + sides[1]);
    }

    private double calculateSide(Point first, Point second) {
        return Math.sqrt(Math.pow((second.getX() - first.getX()), 2) + Math.pow((second.getY() - first.getY()), 2));
    }

    public double[] getSides() {
        double d1 = calculateSide(this.A, this.B);
        double d2 = calculateSide(this.B, this.C);
        double d3 = calculateSide(this.A, this.C);

        return new double[]{d1, d2, d3};
    }
}
