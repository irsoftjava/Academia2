package com.cga.actividad1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // final double PI = 3.141592;
        // final double  E = 2.7182818;

        // creamos el lector, una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // solicitamos que se introduzca el dividendo
        System.out.print("Introduzca el Dividendo: ");
        // lo almacenamos en la variable (dividendo)
        int dividendo = sc.nextInt();
        int divisor = 0;

        // solicitamos que se introduzca el divisor
        // mientras sea menor o igual a cero.
        do {
            System.out.print("Introduzca el Dividendo: ");
            divisor = sc.nextInt();
        } while (divisor <= 0);

        // declaramos y asignamos la variable (cociente)
        double cociente = dividendo / divisor;
        // declaramos y asignamos la variable (cociente)
        double resto = dividendo % divisor;

        System.out.println("El cociente es " + cociente + " y el resto es " + resto);

        // cerramos el lector
        sc.close();
    }
}
