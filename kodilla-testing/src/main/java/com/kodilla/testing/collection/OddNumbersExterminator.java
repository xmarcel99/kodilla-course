package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {

    List<Integer> evenNumbers = new ArrayList<Integer>();

    public  List<Integer> exterminate(ArrayList<Integer> numbers) {

        for (Integer x : numbers) {

            if (x % 2 == 0) {
                evenNumbers.add(x);
            }

        }
        return (ArrayList<Integer>) evenNumbers;
    }


    public int checkIfEmpty(ArrayList<Integer> numbers) {
        return numbers.size();
    }
}

