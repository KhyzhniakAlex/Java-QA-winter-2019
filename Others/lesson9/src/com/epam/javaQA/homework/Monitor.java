package com.epam.javaQA.homework;

import javax.management.ObjectName;

public class Monitor extends Device {

    private double x;
    private double y;

    public Monitor(String serialNumber, String manufacturer, double price, double x, double y) {
        super(serialNumber, manufacturer, price);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + ", x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Monitor other = (Monitor) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
