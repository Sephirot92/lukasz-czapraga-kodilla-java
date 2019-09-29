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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightRoute that = (FlightRoute) o;

        if (!cityTrough.equals(that.cityTrough)) return false;
        return cityOfFinalDestination.equals(that.cityOfFinalDestination);
    }

    @Override
    public int hashCode() {
        int result = cityTrough.hashCode();
        result = 31 * result + cityOfFinalDestination.hashCode();
        return result;
    }
}
