package com.kodilla.testing.shape;

public class Square implements Shape {

    double side;
    String name = "Square";

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return side * side;
    }

    public String toString() {
        return name + ", " + "Field: " + side*side;
    }
}
