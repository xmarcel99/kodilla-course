package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().orElse(0);


        return result;
    }
}
