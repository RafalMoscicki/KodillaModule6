package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");

        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("80000000")));
        europe.addCountry(new Country("Spain", new BigDecimal("50000000")));
        asia.addCountry(new Country("China", new BigDecimal("1500000000")));
        asia.addCountry(new Country("Taiwan", new BigDecimal("23000000")));
        asia.addCountry(new Country("Russia", new BigDecimal("144000000")));
        australia.addCountry(new Country("Australia", new BigDecimal("24000000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(australia);

        BigDecimal expectedPeopleQuantity = new BigDecimal("1859000000");

        // When
        BigDecimal result = world.getPeopleQuantity();

        // Then
        Assert.assertEquals(expectedPeopleQuantity, result);
    }
}
