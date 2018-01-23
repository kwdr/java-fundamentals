package com.classes;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(0, 150);
        for (int i = 0; i < 152; i++) {
            flight.addPassanger(1);
            if (flight.getPassengers() < 150) {
                System.out.println(flight.getPassengers());
            }

        }
    }
}
