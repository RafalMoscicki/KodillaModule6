package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Chopin", true);
        flightMap.put("Balice", false);
        flightMap.put("Heathrow", true);
        flightMap.put("Modlin", false);
        if (flightMap.containsKey(flight.getArrivalAirport())) {
           return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("flight to " + flight.getArrivalAirport() + " not found");
        }
    }
}
