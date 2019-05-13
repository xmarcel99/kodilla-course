package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllowedCities {
    public static void showFlightsFromEnteredCity(String city, Map<DeparturePlace, List<String>> flightBase) {
        String resultCity = flightBase.entrySet().stream()
                .map(x -> x.getKey())
                .map(x -> x.getDeparturePlace())
                .filter(x -> x.equals(city))
                .collect(Collectors.joining());
        List<String> resultList = DeparturePlace.getCityKey(city);
        if (resultList.size() != 0) {
            System.out.println(">>> From " + city + " we have flights to: ");
            resultList.stream()
                    .map(x -> city + "  ------>>>  " + x)
                    .forEach(System.out::println);
        } else {
            System.out.println("Sorry we don't have flight from this city");
        }
    }

    public static void showFlightsToEnteredCity(String city, Map<DeparturePlace, List<String>> flightBase) {
        List<String> citiesWhichYouCanFlightToEnteredCity = new ArrayList<>();
        for (Map.Entry<DeparturePlace, List<String>> x : flightBase.entrySet()) {
            List<String> valueList = x.getValue();
            if (valueList.contains(city)) {
                citiesWhichYouCanFlightToEnteredCity.add(x.getKey().getDeparturePlace());
            }
        }
        if (citiesWhichYouCanFlightToEnteredCity.size() != 0) {
            System.out.println(">>> To " + city + " we have flights from: ");
            citiesWhichYouCanFlightToEnteredCity.stream()
                    .map(x -> x + "   ----->>   " + city)
                    .forEach(System.out::println);
        } else {
            System.out.println("Sorry we don't have flight from this city");
        }
        citiesWhichYouCanFlightToEnteredCity.clear();
    }

    public static void showFlightsThroughEnteredCity(String city, Map<DeparturePlace, List<String>> flightBase) {
        for (Map.Entry<DeparturePlace, List<String>> x : flightBase.entrySet()) {
            List<String> indirectCities = x.getKey().getIndirectCities();
            if (indirectCities.contains(city)) {
                String departureCity = x.getKey().getDeparturePlace();
                int indirectCitiesListLength = x.getKey().getIndirectCities().size();
                System.out.println(departureCity + "  ----->>>   " + x.getKey().getIndirectCities().get(indirectCitiesListLength - 1) + " ||| through: " + city);
            }
        }
    }
}
