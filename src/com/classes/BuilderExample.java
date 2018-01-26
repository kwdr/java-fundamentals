package com.classes;


public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(40);
        Flight myFlight = new Flight(175);
        String location = "Florida";

        sb.append("I flew to");
        sb.append(location);
        sb.append(" on ");
        sb.append(myFlight);

        int time = 9;
        int pos = sb.length() - " on ".length()
                - myFlight.toString().length();

        sb.insert(pos, " at ");

        System.out.println(pos);
    }

    }


