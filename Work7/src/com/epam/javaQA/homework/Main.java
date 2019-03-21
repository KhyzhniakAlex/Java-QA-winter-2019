package com.epam.javaQA.homework;

import com.epam.javaQA.homework.Models.Circle;
import com.epam.javaQA.homework.Models.Rectangle;
import com.epam.javaQA.homework.Models.Shape;
import com.epam.javaQA.homework.Models.Triangle;

public class Main {

    public static void main(String[] args) throws Exception {

        Shape[] shapes = createShapes();

        printShapes(shapes);

        System.out.println("The whole area = " + calcTheWholeArea(shapes));

        double[] areas = calcAreaOfEveryShape(shapes);

        System.out.printf("\nRectangle areas = %f, circle areas = %f, triangle areas = %f", areas[0], areas[1], areas[2]);
    }

    private static void printShapes(Shape[] shapes) {

        for(Shape sh : shapes) {
            System.out.println(sh.toString());
        }
    }

    private static Shape[] createShapes() throws Exception {

        return new Shape[]{
                new Rectangle("blue", 12, 58),
                new Rectangle("red", 58, 12),
                new Rectangle("green", 60, 6),
                new Rectangle("black", 46, 64),

                new Circle("yellow", 10),
                new Circle("white", 20),
                new Circle("gray", 30),

                new Triangle("blue", 4, 6, 9),
                new Triangle("red", 10, 20, 40)};
    }

    private static double calcTheWholeArea(Shape[] shapes) {

        double sum = 0;
        for(Shape sh : shapes) {
            sum += sh.calcArea();
        }

        return sum;
    }

    private static double[] calcAreaOfEveryShape(Shape[] shapes) {

        double[] areas = new double[3];

        double sumRect = 0;
        double sumCircle = 0;
        double sumTriangle = 0;

        for(Shape sh : shapes) {
            if (sh instanceof Rectangle) sumRect += sh.calcArea();
            else if (sh instanceof Circle) sumCircle += sh.calcArea();
            else sumTriangle += sh.calcArea();
        }

        areas[0] = sumRect;
        areas[1] = sumCircle;
        areas[2] = sumTriangle;

        return areas;
    }
}
