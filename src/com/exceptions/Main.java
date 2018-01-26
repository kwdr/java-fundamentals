package com.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Flight f = new Flight(0);
        try {
            f.addPassengers("PassangerList.txt");
            System.out.println("Class Flight has: " + f.getPassangers());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
