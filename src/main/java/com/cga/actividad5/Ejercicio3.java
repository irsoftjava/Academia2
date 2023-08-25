package com.cga.actividad5;

/*
*   Pedir dos números por pantalla e imprimir el mayor de ellos.
    Utilizar el método max() de la clase Math.
* */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el Primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduzca el Segundo número: ");
        double num2 = sc.nextDouble();

        double mayor = Math.max(num1, num2);

        System.out.printf("El mayor de %.2f y %.2f es %.2f", num1, num2, mayor);

        sc.close();
    }
}
