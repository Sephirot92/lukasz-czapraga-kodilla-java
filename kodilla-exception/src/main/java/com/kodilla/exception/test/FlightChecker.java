package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Warsaw", true);
        flightMap.put("Cracow", true);
        flightMap.put("Glasgow", false);

        for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
            /*if (flight.getDepartureAirport() == entry.getKey()){
                System.out.println("This flight is avaible");
                answer = true;
            }else{
                throw new RouteNotFoundException("This airport is not support. Please try different one");
            }*/ //This version was createn by me. It is goot, but it can be upgraded

            //Chief solution
            if (flightMap.containsKey(flight.getDepartureAirport())) {
                return flightMap.get(flight.getDepartureAirport());
            } else {
                throw new RouteNotFoundException("This airport is not support. Please try different one");
            }
        }
        return flightMap.get(flightMap.entrySet().contains(flight.getDepartureAirport()));
    }
}
