package com.epam.java.lab;

import com.epam.java.lab.Exception.SideException;
import com.epam.java.lab.Model.Point;
import com.epam.java.lab.Model.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        TriangleSet ts = new TriangleSet();
        System.out.println("Create triangles:");

        while(true) {
            try {
                System.out.print("Write coordinates for 3 points (x, y) by ', ': ");
                String points = in.nextLine();
                if (points.equals("exit")) break;

                String[] coordinates = points.split(", ");
                double[] numberPoints = new double[6];

                for (int i = 0; i < numberPoints.length; i++) {
                    numberPoints[i] = Double.parseDouble(coordinates[i]);
                }
                Point A = new Point(numberPoints[0], numberPoints[1]);
                Point B = new Point(numberPoints[2], numberPoints[3]);
                Point C = new Point(numberPoints[4], numberPoints[5]);

                Triangle.checkCondition(A, B, C);
                Triangle triangle = new Triangle(A, B, C);

                ts.addTriangle(triangle);
            }
            catch (NumberFormatException nfe) {
                System.out.println("Invalid coordinates");
            }
            catch (SideException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(ts.checkTriangleProperties());
    }
}
