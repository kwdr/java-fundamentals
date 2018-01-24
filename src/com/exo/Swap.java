package com.exo;

public class Swap {
    public static void main(String[] args) {

        swap(5, 10);

    }

    private static void swap(int i, int j) {

        int temp;
        temp = i;
        i = j;
        j = temp;
        System.out.println("i = " + i + " j = " + j );

    }

}
