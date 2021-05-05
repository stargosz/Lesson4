package com.agregation.market;

import com.agregation.country.Country;

import java.util.List;

public class Market {
    private String name;
    private List<Country> countries;

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
