package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightsHolder {
    private Map<String, FlightRoute> flightsMapHolder;

/*    public FlightsHolder() {
        FlightCityOfBeggining begginingCity = new FlightCityOfBeggining();
        begginingCity.flightFrom()
                .stream()
                .toString();

        flightsMapHolder = new HashMap();
        flightsMapHolder.put(begginingCity, )


    }*/

    public Map<String, FlightRoute> getFlightsMapHolder() {
        return flightsMapHolder;
    }
}
