package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WordTestSuite {

    @Test
    public void testgetPeopleQuantity() {

        //Given
        Country country = new Country("Poland", new BigDecimal("12"));
        Country country1 = new Country("Germany", new BigDecimal("12"));
        Continent continent = new Continent("Europe");

        Country country2 = new Country("Ghana", new BigDecimal("50"));
        Country country3 = new Country("Rpa", new BigDecimal("50"));
        Continent continent1 = new Continent("Africa");


        continent.countryListInThisContinent.add(country);
        continent.countryListInThisContinent.add(country1);
        continent1.countryListInThisContinent.add(country2);
        continent1.countryListInThisContinent.add(country3);
        World world = new World();
        world.continentList.add(continent);
        world.continentList.add(continent1);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("124"), result);

    }
}
