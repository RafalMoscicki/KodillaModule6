package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            Flight flight = new Flight("Chopin", "Munich");
            boolean canFly = flightFinder.findFlight(flight);
            if (canFly) {
                System.out.println("you are able to fly to " + flight.getArrivalAirport());
            } else {
                System.out.println("you cannot fly to " + flight.getArrivalAirport());
            }
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

    }
}
