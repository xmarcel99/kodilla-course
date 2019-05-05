package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.List;

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
}
