package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightsHolder {
    private Map<Fligth, FlightRoute> flightsMapHolder;

    public FlightsHolder() {
        flightsMapHolder = new HashMap();

    }

}
