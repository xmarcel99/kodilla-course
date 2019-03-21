package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite  implements  ArrayOperations{

    @Test
    public void testGetAverage() {

        //Given
        int numbers[] = {};

        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 0.0;


        //Then
        System.out.println("Average is: " + result);
        Assert.assertEquals(expectedResult, result,0.001);
    }


}
