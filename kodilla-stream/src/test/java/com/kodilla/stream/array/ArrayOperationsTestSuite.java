package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite  implements  ArrayOperations{

    @Test
    public void testGetAverage() {

        //Given
        int numbers[] = {1,2,3,4,5,6,7,8,9};

        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 5.0;


        //Then
        System.out.println("Average is: " + result);
        Assert.assertEquals(expectedResult, result,0.001);
    }
}
