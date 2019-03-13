package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {

    List<Integer> oddNumbers = new ArrayList<Integer>();

    public void extermiante(ArrayList<Integer> numbers) {

        for (Integer x : numbers) {

            if (x % 2 == 0) {
                oddNumbers.add(x);
            }

        }

    }

    public void getListOfOddNumbers(ArrayList<Integer> theList) {

        for (Integer x : oddNumbers) {
            theList.add(x);
        }

    }

    public int checkIfEmpty(ArrayList<Integer> numbers) {
        return numbers.size();
    }
}

