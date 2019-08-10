package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {
    //first element of the Map is an identifier of weather sit
    //second element of the map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}