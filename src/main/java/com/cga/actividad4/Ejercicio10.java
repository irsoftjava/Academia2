package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 10
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número real: ");
        float real = sc.nextFloat();

        int entera = 0;

        float frac = (real - (int) real);

        if (frac < 0) {
            frac += -(frac * 2);
        }

        if (frac > 0.5) {
            entera = (int) (real - frac);
            entera++;
        } else {
            entera = (int) (real - frac);
        }

        System.out.println("La parte entera de " + real + " es: " + entera);

        sc.close();
    }

}
