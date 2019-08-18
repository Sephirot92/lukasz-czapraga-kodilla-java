package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.math.BigInteger.ZERO;

public final class Continent {
    private final Country country;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final Country country) {
        this.country = country;
    }
    public Country getCountry(){
        return country;
    }
    public BigDecimal getContinentPeopleValue(){
        BigDecimal decimal = new BigDecimal(ZERO);
        decimal = decimal.add(country.getPeopleQuantity());
        return decimal;
    }
    public Set<BigDecimal> getPeopleQuantity(){
        return countries.stream()
                .map(country-> country.getPeopleQuantity())
                .collect(Collectors.toSet());
    }

}
