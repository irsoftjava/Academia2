package com.cga.pro.arrays;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        int tabla[] = new int[10];
        int total = 0;

        for (int i = 0; i < 10; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
            total += tabla[i];
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println("Total: " + total);
    }
}
