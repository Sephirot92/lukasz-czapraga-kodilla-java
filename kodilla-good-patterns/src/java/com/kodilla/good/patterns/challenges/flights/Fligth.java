package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class Fligth {
    private String cityOfBeggining;

    public Fligth(String cityOfBeggining) {
        this.cityOfBeggining = cityOfBeggining;
    }

    public String getCityOfBeggining() {
        return cityOfBeggining;
    }
    public ArrayList <String> createFlightArray(){
        ArrayList<String> possibleBegginingCities = new ArrayList<String>();
        possibleBegginingCities.add("Szczecin");
        possibleBegginingCities.add("Wrocław");
        possibleBegginingCities.add("Kraków");
        possibleBegginingCities.add("Katowice");
        possibleBegginingCities.add("Warszawa");
        return possibleBegginingCities;
    }
}
