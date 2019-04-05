package com.epam.javaQA.homework;

import com.epam.javaQA.homework.Comparators.CompareShapeByArea;
import com.epam.javaQA.homework.Models.Circle;
import com.epam.javaQA.homework.Models.Rectangle;
import com.epam.javaQA.homework.Models.Shape;
import com.epam.javaQA.homework.Models.Triangle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Shape[] shapes = createShapes();

        compareShapes(shapes);

        if (!printShapes(shapes))
            System.out.println("An array is empty");
        else {
            System.out.printf("\nThe whole area = %.2f", calcTheWholeArea(shapes));

            double[] areas = calcAreaOfEveryShape(shapes);
            System.out.printf("\nRectangle areas = %.2f, circle areas = %.2f, triangle areas = %.2f", areas[0], areas[1], areas[2]);
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
                new Triangle("red", 30, 20, 40)};
    }

    private static boolean printShapes(Shape[] shapes) {

        if (shapes == null)
            return false;
        else {
            for(Shape sh : shapes) {
                sh.drawShape();
            }
            return true;
        }
    }

    private static double calcTheWholeArea(Shape[] shapes) {

        double sum = 0;
        for(Shape sh : shapes) {
            if (sh != null)
                sum += sh.calcArea();
        }

        return sum;
    }

    private static double[] calcAreaOfEveryShape(Shape[] shapes) {

        double[] areas = new double[3];

        for(Shape sh : shapes) {
            if (sh != null) {
                if (sh instanceof Rectangle) areas[0] += sh.calcArea();
                else if (sh instanceof Circle) areas[1] += sh.calcArea();
                else areas[2] += sh.calcArea();
            }
        }
        return areas;
    }

    private static void compareShapes(Shape[] shapes) {

        Arrays.sort(shapes, new CompareShapeByArea());
    }
}
