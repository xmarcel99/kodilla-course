package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    final List<Continent> continentList = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        return peopleQuantity;
    }


}
