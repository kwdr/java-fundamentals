package com.loop;

public class Loop {
    public static void main(String[] args) {
        int kVal = 5;
        int factorial = 1;

        while (kVal > 1) {
            factorial *= kVal--;

            System.out.println("Factorial = " + factorial);
            System.out.println("kVal = " + kVal);
        }
        System.out.println(factorial);
    }
}
