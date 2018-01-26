package com.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Flight f = new Flight(0);

        f.addPassengers("PassangerList.txt");
        System.out.println("Class Flight has: " + f.getPassangers());
    }
}
