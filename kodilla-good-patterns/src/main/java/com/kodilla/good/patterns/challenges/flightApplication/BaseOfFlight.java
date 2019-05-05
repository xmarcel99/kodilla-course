package com.kodilla.good.patterns.challenges.flightApplication;
import java.util.*;

public class BaseOfFlight {
    public static  Map<String,List<String>> getDataBase() {
        Map<String, List<String>> flightBase = new HashMap<>();
        DeparturePlace citiesOnTheWayFromCracowToGdans = new DeparturePlace("Kraków",new ArrayList<>(Arrays.asList("Warszawa","Łódź","Kielce","Gdańsk")));
        DeparturePlace  citiesOnTheWayFromGdanskToCracow = new DeparturePlace ("Gdańsk",new ArrayList<>(Arrays.asList("Warszawa","Łódź","Kielce","Kraków")));
        DeparturePlace citiesOnTheWayFromBialystokToWroclaw = new DeparturePlace ("Białystok",new ArrayList<>(Arrays.asList("Warszawa","Łódź","Wrocław")));
        DeparturePlace  citiesOnTheWayFromWroclawToBialystok = new DeparturePlace ("Wrocław",new ArrayList<>(Arrays.asList("Warszawa","Łódź","Białystok")));
        flightBase.put(citiesOnTheWayFromCracowToGdans.getDeparturePlace() ,new ArrayList<>(Arrays.asList("Katowice","Gdańsk")));
        flightBase.put(citiesOnTheWayFromGdanskToCracow.getDeparturePlace(),new ArrayList<>(Arrays.asList("Szczecin","Kraków")));
        flightBase.put(citiesOnTheWayFromBialystokToWroclaw.getDeparturePlace(),new ArrayList<>(Arrays.asList("Suwałki","Wrocław")));
        flightBase.put(citiesOnTheWayFromWroclawToBialystok.getDeparturePlace(),new ArrayList<>(Arrays.asList("Opole","Białystok")));
        return  flightBase;
    }
}
