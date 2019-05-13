package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeparturePlace {
    private String departurePlace;
    private List<String> indirectCities;

    public DeparturePlace(String departurePlace, List<String> indirectCities) {
        this.departurePlace = departurePlace;
        this.indirectCities = indirectCities;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public List<String> getIndirectCities() {
        return indirectCities;
    }

    @Override
    public boolean equals(Object o) {
        DeparturePlace that = (DeparturePlace) o;
        return departurePlace.equals(that.departurePlace);
    }

    @Override
    public int hashCode() {
        return departurePlace.hashCode();
    }

    public static List<String> getCityKey(String city) {
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<DeparturePlace, List<String>> y : BaseOfFlight.getDataBase().entrySet()) {
            String departureCity = y.getKey().getDeparturePlace();
            if (departureCity.equals(city)) {
                resultList = y.getValue();
            }
        }
        return resultList;
    }
}
