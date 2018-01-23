package com.classes;

public class NextFlight {
    public static void main(String[] args) {
        Flight lax1 = new Flight(50,150);
        Flight lax2 = new Flight(50,150);
        // add passengers to both flights

        Flight lax3;
        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createNewWithBoth(lax2);
            if (lax3 != null) {
                System.out.println("In lax1 there is:" + lax3.getPassengers() + " Passengers, Seats " + lax3.getSeats());

            }

        }

    }

}
