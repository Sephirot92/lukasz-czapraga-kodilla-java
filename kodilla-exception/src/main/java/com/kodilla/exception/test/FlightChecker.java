package com.kodilla.exception.test;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        HashMap <String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Warsaw", true);
        flightMap.put("Cracow", true);
        flightMap.put("Glasgow", false);

        boolean answer = false;

        for(Map.Entry<String, Boolean> entry : flightMap.entrySet()){
            if (flight.getDepartureAirport() == entry.getKey()){
                System.out.println("This flight is avaible");
                answer = true;
            }else{
                throw new RouteNotFoundException("This airport is not support. Please try different one");
            }
        }
        return answer;
    }
}
