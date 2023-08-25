package com.cga.actividad5;

/*
*   Generar un número aleatorio entre 1 y 10.
*   Utilizar el método random() de la clase Math.
* */

public class Ejercicio5 {

    public static void main(String[] args) {

        int valorAleatorio = (int)(Math.random() * 10 + 1);
        System.out.printf("El valor generado aleatoriamente entre 1 y 10 es: %d", valorAleatorio);
    }
}
