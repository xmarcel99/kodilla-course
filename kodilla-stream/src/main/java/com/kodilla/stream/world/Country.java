package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private  String country;
    private BigDecimal peopleQuantityInCountry;

    public Country(String country,BigDecimal peopleQuantityInCountry) {
        this.country = country;
        this.peopleQuantityInCountry = peopleQuantityInCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantityInCountry;
    }
}
