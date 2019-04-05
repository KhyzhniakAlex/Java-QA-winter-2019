package com.epam.javaQA.homework;

public class Device {

    private String serialNumber;
    private String manufacturer;

    private double price;

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Device))
            return false;
        Device other = (Device)obj;
        if (Double.compare(this.price, other.price) != 0)
            return false;
        if (!this.manufacturer.equalsIgnoreCase(other.manufacturer))
            return false;
        return this.serialNumber.equals(other.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = result * 31 + serialNumber.hashCode();
        result = result * 31 + manufacturer.hashCode();
        result = result * 31 + Double.hashCode(price);
        return result;
    }
}

//|| this.serialNumber.equals(d.serialNumber) && this.manufacturer.equals(d.manufacturer)
