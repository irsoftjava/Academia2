package com.cga.pro.arrays;

import java.util.Arrays;

public class Ejercicio5 {

    public static int[] rellenaPares(int longitud, int fin) {
        int tabla[] = new int[longitud];
        int valor = 0;

        // Genera valores
        for (int i = 0; i < longitud; i++) {
            do {
                valor = (int) (Math.random() * fin + 1);
            } while (valor % 2 != 0);

            tabla[i] = valor;
        }

        // Ordena la Tabla
        int swap = 0;
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = i + 1; j < longitud; j++) {
                if (tabla[i] > tabla[j]) {
                    swap = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = swap;
                }
            }
        }

        return tabla;
    }

    public static void main(String[] args) {

        int tabla[] = rellenaPares(30, 120);

        System.out.println("Tabla: " + Arrays.toString(tabla));
    }
}
