package com.cga.pro.arrays;

import java.util.Arrays;

public class Ejercicio6 {

    public static int numeroDeAciertosPrimitiva(int[] apuesta, int[] ganadora) {
        int aciertos = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                }
            }
        }

        return aciertos;
    }

    public static void main(String[] args) {

        int a[] = {3,  5, 11, 20, 46, 49};
        int b[] = {5, 15, 17, 20, 37, 49};

        int aciertos = numeroDeAciertosPrimitiva(a, b);

        System.out.println("Apuesta Jugada:   " + Arrays.toString(a));
        System.out.println("Apuesta Ganadora: " + Arrays.toString(b));
        System.out.printf("Su apuesta tiene %d aciertos: ", aciertos);
    }
}
