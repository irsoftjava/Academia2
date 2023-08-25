package com.cga.pro.arrays;

import java.util.Arrays;

public class Ejercicio4 {

    public static int maximo(int t[]) {
        int max = Integer.MIN_VALUE;

        for (int v : t) {
            if (v > max) max = v;
        }

        return max;
    }

    public static void main(String[] args) {

        int tabla[] = {2, 3, 9, 22, 65, 123, 34, 97, 4, 12};
        System.out.print(Arrays.toString(tabla));
        System.out.printf(" Máximo es: %d", maximo(tabla));

    }
}
