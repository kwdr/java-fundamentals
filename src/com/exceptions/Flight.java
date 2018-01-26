package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Flight {
    private int passangers;

    public Flight(int passangers) {
        this.passangers = passangers;
    }

    public int getPassangers() {
        return passangers;
    }

    @Override
    public String toString() {
        String s = "Number of passangers: " + this.passangers;
        return  s;
    }

    public void addPassengers(String filename) throws IOException {
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(filename));
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            passangers += Integer.valueOf(parts[0]);
        }

    }
}
