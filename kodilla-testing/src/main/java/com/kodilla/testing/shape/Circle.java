package com.kodilla.testing.shape;

public class Circle implements Shape {

    double r;
    String name = "Circle";

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return 3.14 * r * r;
    }

    public String toString() {
        return name + ", " + "Field: " + 3.14 * r * r;
    }
}
