package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.*;

public class BaseOfFlight {
    public static Map<DeparturePlace, List<String>> getDataBase() {
        Map<DeparturePlace, List<String>> flightBase = new HashMap<>();
        DeparturePlace citiesOnTheWayFromCracowToGdans = new DeparturePlace("Kraków", new ArrayList<>(Arrays.asList("Warszawa", "Łódź", "Kielce", "Gdańsk")));
        DeparturePlace citiesOnTheWayFromGdanskToCracow = new DeparturePlace("Gdańsk", new ArrayList<>(Arrays.asList("Warszawa", "Łódź", "Kielce", "Kraków")));
        DeparturePlace citiesOnTheWayFromBialystokToWroclaw = new DeparturePlace("Białystok", new ArrayList<>(Arrays.asList("Warszawa", "Łódź", "Wrocław")));
        DeparturePlace citiesOnTheWayFromWroclawToBialystok = new DeparturePlace("Wrocław", new ArrayList<>(Arrays.asList("Warszawa", "Łódź", "Białystok")));
        flightBase.put(citiesOnTheWayFromCracowToGdans, new ArrayList<>(Arrays.asList("Katowice", "Gdańsk")));
        flightBase.put(citiesOnTheWayFromGdanskToCracow, new ArrayList<>(Arrays.asList("Szczecin", "Kraków")));
        flightBase.put(citiesOnTheWayFromBialystokToWroclaw, new ArrayList<>(Arrays.asList("Suwałki", "Wrocław")));
        flightBase.put(citiesOnTheWayFromWroclawToBialystok, new ArrayList<>(Arrays.asList("Opole", "Białystok")));
        return flightBase;
    }
}
