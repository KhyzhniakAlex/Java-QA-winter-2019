package com.epam.java.lab;

import com.epam.java.lab.Model.Triangle;

import java.util.HashSet;
import java.util.Set;

public class TriangleSet {

    private Set<Triangle> triangles;

    public TriangleSet() {
        triangles = new HashSet<>();
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public String checkTriangleProperties() {
        StringBuilder st = new StringBuilder();
        int number = 1;

        for (Triangle triangle : triangles) {
            st.append("\nTriangle(").append(number).append("):");

            if (checkForRightTriangle(triangle)) st.append("\n - right;");
            else {
                if (checkForObtuseTriangle(triangle)) st.append("\n - obtuse;");
                else st.append("\n - acute");
            }

            if (checkForEquilateralTriangle(triangle)) st.append("\n - equilateral;");
            else {
                if (checkForIsoscelesTriangle(triangle)) st.append("\n - isosceles;");
                else st.append("\n - versatile;");
            }
            number++;
        }

        return st.toString();
    }

    private boolean checkForEquilateralTriangle(Triangle triangle) {
        double[] sides = Triangle.getSides(triangle.getA(), triangle.getB(), triangle.getC());
        return (sides[0] == sides[1] && sides[1] == sides[2]);
    }

    private boolean checkForIsoscelesTriangle(Triangle triangle) {
        double[] sides = Triangle.getSides(triangle.getA(), triangle.getB(), triangle.getC());
        return (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]);
    }

    private boolean checkForRightTriangle(Triangle triangle) {
        double[] sides = Triangle.getSides(triangle.getA(), triangle.getB(), triangle.getC());
        return (Math.pow(sides[2], 2) == Math.pow(sides[0], 2) + Math.pow(sides[1], 2) ||
                Math.pow(sides[1], 2) == Math.pow(sides[2], 2) + Math.pow(sides[0], 2) ||
                Math.pow(sides[0], 2) == Math.pow(sides[1], 2) + Math.pow(sides[2], 2));
    }

    private boolean checkForObtuseTriangle(Triangle triangle) {
        double[] sides = Triangle.getSides(triangle.getA(), triangle.getB(), triangle.getC());
        return (Math.pow(sides[0], 2) > Math.pow(sides[1], 2) + Math.pow(sides[2], 2) ||
                Math.pow(sides[1], 2) > Math.pow(sides[0], 2) + Math.pow(sides[2], 2) ||
                Math.pow(sides[2], 2) > Math.pow(sides[0], 2) + Math.pow(sides[1], 2));
    }
}
