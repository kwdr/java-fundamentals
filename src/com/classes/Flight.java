package com.classes;

public class Flight {
    private int passengers;
    private int seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    private int flightNumber;

    {
        isSeatAvailable = new boolean[this.seats];

        for (int i = 0; i < this.seats; i++)
            isSeatAvailable[i] = true;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Flight(int passengers, int seats) {
        this.passengers = passengers;
        this.seats = seats;
    }

    void addPassanger(int numberOfPassengers) {
        if (passengers < seats) {
            passengers += 1;

        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too Many Passengers");
    }

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight(f2.passengers, f2.seats);
        newFlight.passengers += passengers;
        return newFlight;

    }

    public Flight() {

    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }
}
