package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllowedCities {
    public static void showFlightsFromEnteredCity(String city, Map<String, List<String>> flightBase) {
        List<String> resultList = flightBase.get(city);
        if (resultList.size() != 0) {
            System.out.println(">>> From " + city + " we have flights to: ");
            resultList.stream()
                    .map(x -> city + "  ------>>>  " + x)
                    .forEach(System.out::println);
        }else {
            System.out.println("Sorry we don't have flight from this city");
        }
    }
    public static void showFlightsToEnteredCity(String city, Map<String, List<String>> flightBase) {
        List<String> citiesWhichYouCanFlightToEnteredCity = new ArrayList<>();
        for(Map.Entry<String,List<String>> x: flightBase.entrySet()) {
            List<String>  valueList = x.getValue();
            if(valueList.contains(city)) {
                citiesWhichYouCanFlightToEnteredCity.add(x.getKey());
            }
        }
        if(citiesWhichYouCanFlightToEnteredCity.size() != 0) {
            System.out.println(">>> To " + city + " we have flights from: ");
            citiesWhichYouCanFlightToEnteredCity.stream()
                    .map(x-> x + "   ----->>   " + city )
                    .forEach(System.out::println);
        } else {
            System.out.println("Sorry we don't have flight from this city");
        }
        citiesWhichYouCanFlightToEnteredCity.clear();
    }
}
