package com.kodilla.good.patterns.challenges.flights;

public class FlightRoute {
    private String cityTrough;
    private String cityOfFinalDestination;

    public FlightRoute(String cityTrough, String cityOfFinalDestination) {
        this.cityTrough = cityTrough;
        this.cityOfFinalDestination = cityOfFinalDestination;
    }

    public String getCityTrough() {
        return cityTrough;
    }

    public String getCityOfFinalDestination() {
        return cityOfFinalDestination;
    }

}
