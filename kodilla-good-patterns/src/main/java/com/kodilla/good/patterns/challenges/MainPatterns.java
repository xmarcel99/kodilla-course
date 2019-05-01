package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainPatterns {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> resultMap = movieStore.getMovies();
        String titlesOfMovies = resultMap.entrySet().stream()
                .flatMap(x-> x.getValue().stream())
                .collect(Collectors.joining(" !"," <<< " , ">>>>"));

        System.out.println(titlesOfMovies);
    }
}
