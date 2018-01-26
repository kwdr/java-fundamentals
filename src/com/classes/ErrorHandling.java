package com.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorHandling {
    public static void main(String[] args) {

        BufferedReader reader = null;
        int total = 0;
        try {
            reader =
                    new BufferedReader(new FileReader("stub.txt"));
            String line = null;
            while ((line = reader.readLine()) != null )
                total += Integer.valueOf(line);
            System.out.println("Total: " + total);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value: " + e.getMessage());

        } catch (FileNotFoundException e) {
            System.out.println("Not found: " + e.getMessage() );

        } catch (Exception e) {
            System.out.println("Exception: " +  e.getMessage());

        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
