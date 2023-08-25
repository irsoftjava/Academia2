package com.cga.actividad7;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] tabla = new int[10];
        int suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int)(Math.random() * 100 + 1);
            suma += tabla[i];
            //System.out.printf("%d ", tabla[i]);
        }
        System.out.println("Valores generados: " + Arrays.toString(tabla));
        System.out.println("La Suma de los valores generados es: " + suma);
    }
}
