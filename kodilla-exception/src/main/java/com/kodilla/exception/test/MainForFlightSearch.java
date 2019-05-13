package com.kodilla.exception.test;

public class MainForFlightSearch {
    public static void main(String[] args) {

        Flight flight = new Flight("Krakow", "Moskwa");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Hope you enjoy using our applications :)");
        }

    }
}
