package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EvenNumbersTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        //Then
        List<Integer> expectedTabOfEvenNumbers = new ArrayList<Integer>(Arrays.asList(2, 4));
        Assert.assertEquals(expectedTabOfEvenNumbers, result);


    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
        //When
        int size = oddNumbersExterminator2.checkIfEmpty(new ArrayList<>());
        //Then
        Assert.assertEquals(0, size);

    }


}
