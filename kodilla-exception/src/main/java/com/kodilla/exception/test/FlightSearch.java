package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> flightsMap = new HashMap<>();
        flightsMap.put("London",true);
        flightsMap.put("Warsaw",false);
        flightsMap.put("Berlin",true);

        if(flightsMap.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight opportunity to " + flight.getArrivalAirport()+": " + flightsMap.get(flight.getArrivalAirport()));
        } else {
            throw new RouteNotFoundException("Planes doesn't fly there :(");
        }
    }
}
