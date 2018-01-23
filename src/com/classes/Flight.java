package com.classes;

public class Flight {
    private int passengers;
    private int seats;

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
}
