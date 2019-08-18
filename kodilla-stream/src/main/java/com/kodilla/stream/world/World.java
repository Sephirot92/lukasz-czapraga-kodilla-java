package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {
    private final Continent continent;
    private final List<Continent> continents = new ArrayList<>();

    public World(Continent continent) {
        this.continent = continent;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }
    public Set<BigDecimal> getPeopleQuantity(){
        return continents.stream()
                .flatMap(countries -> countries.getPeopleQuantity().stream())
                .collect(Collectors.toSet());
    }
}
