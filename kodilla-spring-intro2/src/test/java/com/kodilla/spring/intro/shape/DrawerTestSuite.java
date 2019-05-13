package com.kodilla.spring.intro.shape;

import com.kodilla.spring.intro.Drawer;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawing() {
        //Given
        Drawer drawer = new Drawer();
        //When
        drawer.doDrawing();
        //Then
        //do nothing
    }
}