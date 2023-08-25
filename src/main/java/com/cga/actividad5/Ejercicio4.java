package com.cga.actividad5;

import java.util.Scanner;

/*
*   Pedir dos números por pantalla e imprimir el menor de ellos.
    Utilizar el método max() de la clase Math.
* */

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el Primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduzca el Segundo número: ");
        double num2 = sc.nextDouble();

        double menor = Math.min(num1, num2);

        System.out.printf("El menor de %.2f y %.2f es %.2f", num1, num2, menor);

        sc.close();
    }
}
