package com.cga.actividad5;

/*
*   Pedir dos números por pantalla y realizar la división entre ambos. Formatear la salida con dos decimales.
* */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el Primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduzca el Segundo número: ");
        double num2 = sc.nextDouble();

        double cociente = num1 / num2;

        System.out.printf("El resultado de la dividir %f y %f es: %.2f", num1, num2, cociente);
    }
}
