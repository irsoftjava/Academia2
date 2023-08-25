package com.cga.actividad1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca los °C: ");
        float gradosCentigrados = sc.nextFloat();

        float gradosFahrenheit = ((gradosCentigrados * 9) / 5) + 32;

        System.out.println(gradosCentigrados + "°C equivalen a " + gradosFahrenheit + "°F");

        sc.close();
    }
}
