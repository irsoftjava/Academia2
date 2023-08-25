package com.cga.actividad5;

/*
*   Crear un programa que pida el radio de un círculo y calcule su área mediante la siguiente fórmula:
*
*                               A = PI * r^2
*
*   Utiliza la constante PI de la clase Math.
* */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el radio del Circulo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El área del circulo de radio %.2f es : %.2f", radio, area);

        sc.close();
    }
}
