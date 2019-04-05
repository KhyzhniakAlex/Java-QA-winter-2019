package com.epam.javaQA.homework;

public class Device {

    private String serialNumber;
    private String manufacturer;

    private double price;

    public Device(String serialNumber, String manufacturer, double price) {

    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": serialNumber = " + serialNumber +
                ", manufacturer = " + manufacturer +
                ", price = " + price;
    }
}
