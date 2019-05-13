package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String continent;
    final List<Country> countryListInThisContinent = new ArrayList<>();

    public Continent(String continent) {
        this.continent = continent;
    }

    public List<Country> getCountryList() {
        return new ArrayList<Country>(countryListInThisContinent);
    }
}
