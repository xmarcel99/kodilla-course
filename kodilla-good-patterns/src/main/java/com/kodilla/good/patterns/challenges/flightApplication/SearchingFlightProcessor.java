package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.List;
import java.util.Map;

public class SearchingFlightProcessor {
    static private Map<DeparturePlace, List<String>> flightBase = BaseOfFlight.getDataBase();

    public static void processor() {
        int optionNumber = InputData.startApplication();
        if (optionNumber == 1) {
            System.out.print("Enter city which you want to travel witch: ");
            String city = InputData.enterCountry();
            AllowedCities.showFlightsFromEnteredCity(city, flightBase);
        } else if (optionNumber == 2) {
            System.out.print("Enter city which you want to reach: ");
            String city = InputData.enterCountry();
            AllowedCities.showFlightsToEnteredCity(city, flightBase);
        } else if (optionNumber == 3) {
            System.out.println("Enter city which is between departure city and arrival city :");
            String city = InputData.enterCountry();
            AllowedCities.showFlightsThroughEnteredCity(city, flightBase);

        }
    }
}
