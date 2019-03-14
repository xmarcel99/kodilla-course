package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {

        //Given
        Square square = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //When
        int sizeOfList = shapeCollector.shapes.size();

        //Then
        Assert.assertEquals(1,sizeOfList);
    }

    @Test
    public void testRemoveFigure() {

        //Given
        Square square = new Square(5);
        Circle circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(square);
        int sizeOfList = shapeCollector.shapes.size();

        //Then
        Assert.assertEquals(1,sizeOfList);

    }

    @Test
    public void testGetFigure() {

        //Given
        Square square = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square,figure);
    }

    @Test
    public void testShowFigures() {

        //Given
        Square square = new Square(5);
        Triangle triangle = new Triangle(5,4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        List<Shape> shapes = new ArrayList<Shape>(Arrays.asList(square,triangle));

        //When
        List<Shape> result = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(shapes,result);

    }
}
