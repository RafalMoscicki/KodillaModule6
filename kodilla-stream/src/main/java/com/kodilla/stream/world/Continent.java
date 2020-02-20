package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final List<Country> countryList;
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
        countryList = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(countryList, continent.countryList) &&
                Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryList, continentName);
    }
}
