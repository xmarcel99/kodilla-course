package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class oddNumbersTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        oddNumbersExterminator.extermiante(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        //Then
        List<Integer> oddNumber = new ArrayList<Integer>();
        oddNumbersExterminator.getListOfOddNumbers((ArrayList<Integer>) oddNumber);

        int counter = 0;

        for(Integer x: oddNumber) {
            if(x % 2 == 0) {
                counter ++;
            }
        }
        if(counter == oddNumber.size()) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error !");
        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
        //When
        int size = oddNumbersExterminator2.checkIfEmpty(new ArrayList<>());
        //Then
        if(size == 0) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error");
        }




    }
}
